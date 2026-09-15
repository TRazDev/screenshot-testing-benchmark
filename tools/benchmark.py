#!/usr/bin/env python3
"""Times recording and verifying the same screenshots with each tool.

Expects one checkout per tool, side by side, each on its own branch:

    runs/mugshot                     (branch mugshot)
    runs/mugshot-downscale-1         (branch mugshot, with downscale=1)
    runs/paparazzi                   (branch paparazzi)
    runs/compose-preview             (branch compose-preview-screenshot-testing)

    python3 tools/benchmark.py --runs runs --rounds 3

Compilation happens first and is not timed. Every timed build starts from a stopped Gradle
daemon, runs with the build cache off, and forces only the screenshot tasks to rerun, so what is
measured is rendering and comparing, not compiling. Verify runs rotate the order of the tools in
each round, because whichever build goes first after a quiet machine tends to be faster.
"""
import argparse, csv, glob, json, os, platform, subprocess, time
import xml.etree.ElementTree as ET

TOOLS = {
    "mugshot": {
        "compile": ["compileDebugUnitTestKotlin"],
        "record": ["recordMugshotDebug", "mugshotTestDebug", "--rerun"],
        "verify": ["verifyMugshotDebug", "mugshotTestDebug", "--rerun"],
        "images": "*/src/test/snapshots/images/*.webp",
    },
    "mugshot-downscale-1": {
        "compile": ["compileDebugUnitTestKotlin"],
        "record": ["recordMugshotDebug", "mugshotTestDebug", "--rerun"],
        "verify": ["verifyMugshotDebug", "mugshotTestDebug", "--rerun"],
        "images": "*/src/test/snapshots/images/*.webp",
    },
    "paparazzi": {
        "compile": ["compileDebugUnitTestKotlin"],
        "record": ["recordPaparazziDebug", "testDebugUnitTest", "--rerun"],
        "verify": ["verifyPaparazziDebug", "testDebugUnitTest", "--rerun"],
        "images": "*/src/test/snapshots/images/*.png",
    },
    "compose-preview": {
        "compile": ["compileDebugScreenshotTestKotlin"],
        "record": ["updateDebugScreenshotTest", "--rerun"],
        "verify": ["validateDebugScreenshotTest", "--rerun"],
        "images": "*/src/screenshotTestDebug/reference/**/*.png",
    },
}


EXTRA_ARGS = []
TIMEOUT_SECONDS = 1800


def gradle(checkout, args, log):
    """Runs one build from a stopped daemon. A build over the time limit is stopped and reported as
    exit code 124, and one that exhausts memory as 137, so a tool that cannot finish costs one row
    rather than the whole run."""
    subprocess.run(["./gradlew", "--stop"], cwd=checkout, capture_output=True)
    start = time.time()
    with open(log, "w") as out:
        process = subprocess.Popen(
            ["./gradlew", *args, *EXTRA_ARGS, "--no-build-cache", "--console=plain"],
            cwd=checkout, stdout=out, stderr=subprocess.STDOUT,
        )
        code = None
        while code is None:
            code = process.poll()
            if code is not None:
                break
            if time.time() - start > TIMEOUT_SECONDS:
                code = 124
            elif memory_free_percent() < 8:
                code = 137
            else:
                time.sleep(2)
                continue
            process.kill()
            subprocess.run(["pkill", "-9", "-f", "PreviewScreenshotTestEngine"], capture_output=True)
            subprocess.run(["pkill", "-f", "GradleWorkerMain"], capture_output=True)
            subprocess.run(["./gradlew", "--stop"], cwd=checkout, capture_output=True)
    return time.time() - start, code


def memory_free_percent():
    """macOS's own measure of free memory. The build is stopped below 8%, reported as exit code 137,
    before the machine starts swapping hard enough to distort every other measurement."""
    output = subprocess.run(["memory_pressure", "-Q"], capture_output=True, text=True).stdout
    for line in output.splitlines():
        if "free percentage" in line:
            return int(line.rsplit(":", 1)[1].strip().rstrip("%"))
    return 100


def test_results(checkout, since):
    """Test cases, failures and summed test time from the JUnit reports this build wrote."""
    tests = failures = 0
    seconds = 0.0
    for report in glob.glob(os.path.join(checkout, "*/build/test-results/**/*.xml"), recursive=True):
        if os.path.getmtime(report) < since:
            continue
        root = ET.parse(report).getroot()
        suites = [root] if root.tag == "testsuite" else root.findall("testsuite")
        for suite in suites:
            tests += int(suite.get("tests", 0))
            failures += int(suite.get("failures", 0)) + int(suite.get("errors", 0))
            seconds += float(suite.get("time", 0))
    return tests, failures, seconds


def image_stats(checkout, pattern):
    files = glob.glob(os.path.join(checkout, pattern), recursive=True)
    return len(files), sum(os.path.getsize(f) for f in files)


def main():
    ap = argparse.ArgumentParser()
    ap.add_argument("--runs", default="runs")
    ap.add_argument("--rounds", type=int, default=3)
    ap.add_argument("--tools", nargs="*", default=list(TOOLS))
    ap.add_argument("--out", default="results")
    ap.add_argument("--phases", nargs="*", default=["compile", "record", "verify"])
    ap.add_argument("--max-workers", type=int, help="passed to every build as --max-workers")
    ap.add_argument("--timeout", type=int, default=1800, help="seconds before a build is stopped")
    args = ap.parse_args()
    global TIMEOUT_SECONDS
    TIMEOUT_SECONDS = args.timeout
    if args.max_workers:
        EXTRA_ARGS.append(f"--max-workers={args.max_workers}")

    raw = os.path.join(args.out, "raw")
    os.makedirs(raw, exist_ok=True)
    rows = []

    def record_row(tool, phase, attempt, seconds, code, since, checkout):
        tests, failures, test_seconds = test_results(checkout, since)
        count, size = image_stats(checkout, TOOLS[tool]["images"])
        row = dict(tool=tool, max_workers=args.max_workers or "default", phase=phase, attempt=attempt, wall_seconds=round(seconds, 1),
                   exit_code=code, tests=tests, failures=failures,
                   test_seconds=round(test_seconds, 1), images=count, image_bytes=size)
        rows.append(row)
        print(json.dumps(row), flush=True)
        with open(os.path.join(args.out, "results.csv"), "w", newline="") as f:
            writer = csv.DictWriter(f, fieldnames=list(row))
            writer.writeheader()
            writer.writerows(rows)

    for tool in args.tools if "compile" in args.phases else []:
        checkout = os.path.join(args.runs, tool)
        seconds, code = gradle(checkout, TOOLS[tool]["compile"], os.path.join(raw, f"{tool}-compile.log"))
        print(f"{tool}: compiled in {seconds:.0f}s (exit {code})", flush=True)

    for tool in args.tools if "record" in args.phases else []:
        checkout = os.path.join(args.runs, tool)
        for image in glob.glob(os.path.join(checkout, TOOLS[tool]["images"]), recursive=True):
            os.remove(image)
        since = time.time()
        seconds, code = gradle(checkout, TOOLS[tool]["record"], os.path.join(raw, f"{tool}-record.log"))
        record_row(tool, "record", 1, seconds, code, since, checkout)

    order = list(args.tools)
    for attempt in range(1, args.rounds + 1 if "verify" in args.phases else 1):
        for tool in order:
            checkout = os.path.join(args.runs, tool)
            since = time.time()
            seconds, code = gradle(
                checkout, TOOLS[tool]["verify"], os.path.join(raw, f"{tool}-verify-{attempt}.log"),
            )
            record_row(tool, "verify", attempt, seconds, code, since, checkout)
        order = order[1:] + order[:1]

    machine = {
        "platform": platform.platform(),
        "cpu": subprocess.run(["sysctl", "-n", "machdep.cpu.brand_string"], capture_output=True, text=True).stdout.strip(),
        "cores": os.cpu_count(),
        "memory_bytes": int(subprocess.run(["sysctl", "-n", "hw.memsize"], capture_output=True, text=True).stdout.strip() or 0),
    }
    with open(os.path.join(args.out, "machine.json"), "w") as f:
        json.dump(machine, f, indent=2)


if __name__ == "__main__":
    main()
