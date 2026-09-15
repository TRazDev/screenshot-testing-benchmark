# Results

Measured on 15 September 2026 on a MacBook Pro with an Apple M5 Pro (15 cores) and 24 GB of memory,
Gradle 9.7.1, AGP 9.3.2, JDK 21. Times are wall clock, from `tools/benchmark.py`, which checks on a
build every 2 seconds, so a time is accurate to about 2 seconds.

Every run that finished passed all 7,176 screenshots.

## Default settings

| | Record | Verify, median of 3 | Verify runs |
| --- | --- | --- | --- |
| Mugshot 3.4.2 | 62 s | 58 s | 62, 58, 58 |
| Mugshot 3.4.2, `downscale=1` | 150 s | 149 s | 149, 147, 153 |
| Paparazzi 2.0.0-alpha05 | 107 s | 89 s | 93, 89, 89 |
| Compose Preview Screenshot Testing 0.0.1-alpha16, `maxHeapSize=2g` | 226 s | did not finish | |

Compose Preview Screenshot Testing verifying at default parallelism took free memory from 71% to
32% within three minutes, grew swap by about a gigabyte, and was killed for lack of memory.

Folders: [`default-workers`](default-workers), [`default-workers-compose-preview`](default-workers-compose-preview),
[`default-workers-compose-preview-verify`](default-workers-compose-preview-verify) (the partial log of
the killed run).

## `--max-workers=3`

| | Record | Verify, median of 3 | Verify runs |
| --- | --- | --- | --- |
| Mugshot 3.4.2 | 88 s | 88 s | 86, 88, 88 |
| Mugshot 3.4.2, `downscale=1` | 179 s | 215 s | 207, 217, 215 |
| Paparazzi 2.0.0-alpha05 | 205 s | 149 s | 147, 149, 149 |
| Compose Preview Screenshot Testing 0.0.1-alpha16, `maxHeapSize=2g` | 347 s | 728 s | 728, 722, 728 |

Folder: [`max-workers-3`](max-workers-3). `memory-samples.csv` holds free memory and swap sampled
every 5 seconds during these runs; `tools/memory_by_build.py` matches them to builds.

## Golden images on disk

| | Phone image | All 7,176 |
| --- | --- | --- |
| Mugshot | 360 × 808 WebP | 75 MB |
| Mugshot, `downscale=1` | 1080 × 2424 WebP | 237 MB |
| Paparazzi | 445 × 1000 PNG | 279 MB |
| Compose Preview Screenshot Testing | 1079 × 2423 PNG | 619 MB |

## Compose Preview Screenshot Testing's default heap

[`overnight-default-heap`](overnight-default-heap) is the first attempt, with the plugin's default
heap. Recording hit `OutOfMemoryError: Java heap space`, 347 screenshots failed, and the build stopped
making progress without failing. It was stopped by hand about eight hours later. Its `results.csv`
also has that session's record times for the other tools, which match the later runs.

[`single-module-heap`](single-module-heap) is one module (`feature-activity`, 336 screenshots) recorded
on its own: with the default heap 66 screenshots failed with 16 out-of-memory errors in 122 seconds,
and with `android.compose.screenshot.maxHeapSize=2g` every screenshot recorded in 51 seconds.
