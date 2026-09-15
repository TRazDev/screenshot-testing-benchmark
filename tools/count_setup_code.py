#!/usr/bin/env python3
"""Counts the lines each tool's branch adds to the same app on main.

    python3 tools/count_setup_code.py

Lines are sorted into build configuration, separate test code, and changes to the app's own
source files (for Mugshot, the annotations on existing previews). Blank lines are not counted.
"""
import subprocess

BRANCHES = ["mugshot", "paparazzi", "compose-preview-screenshot-testing"]


def added_lines(branch):
    diff = subprocess.run(
        ["git", "diff", "--unified=0", f"main..{branch}"], capture_output=True, text=True, check=True
    ).stdout
    counts = {"build": 0, "test code": 0, "app source": 0}
    path = None
    for line in diff.splitlines():
        if line.startswith("+++ "):
            path = line[6:] if line.startswith("+++ b/") else None
            continue
        if not line.startswith("+") or line.startswith("+++") or path is None:
            continue
        if not line[1:].strip():
            continue
        if path.endswith((".gradle.kts", ".toml", ".properties")):
            counts["build"] += 1
        elif "/src/test/" in path or "/src/screenshotTest/" in path:
            counts["test code"] += 1
        else:
            counts["app source"] += 1
    return counts


def main():
    print("| Branch | Build configuration | Test code | Changes to app source | Total |")
    print("| --- | --- | --- | --- | --- |")
    for branch in BRANCHES:
        c = added_lines(branch)
        print(f"| {branch} | {c['build']} | {c['test code']} | {c['app source']} | {sum(c.values())} |")


if __name__ == "__main__":
    main()
