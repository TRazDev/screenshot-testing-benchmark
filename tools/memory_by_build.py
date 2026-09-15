#!/usr/bin/env python3
"""Lowest free memory seen during each timed build.

Pairs results/memory-samples.csv (unix time, macOS free memory percentage, swap MB, sampled every
5 seconds) with each build's log: the log is last written when the build ends, and results.csv has
how long it ran.

    python3 tools/memory_by_build.py results/max-workers-3
"""
import csv, os, sys

samples = [tuple(map(float, row)) for row in csv.reader(open("results/memory-samples.csv")) if len(row) == 3]
for out in sys.argv[1:]:
    for r in csv.DictReader(open(os.path.join(out, "results.csv"))):
        name = f"{r['tool']}-{r['phase']}" + (f"-{r['attempt']}" if r["phase"] == "verify" else "") + ".log"
        log = os.path.join(out, "raw", name)
        if not os.path.exists(log):
            continue
        end = os.path.getmtime(log); start = end - float(r["wall_seconds"])
        window = [s for s in samples if start <= s[0] <= end]
        if not window:
            continue
        print(f"{out:40} {r['tool']:22} {r['phase']:6} {r['attempt']}  min free {min(s[1] for s in window):.0f}%  max swap {max(s[2] for s in window):.0f} MB")
