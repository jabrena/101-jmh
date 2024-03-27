# Async Profiler

## Flamegraph support

```bash
wget https://github.com/async-profiler/async-profiler/releases/download/v3.0/async-profiler-3.0-linux-x64.tar.gz
tar -xvf async-profiler-3.0-linux-x64.tar.gz
wget https://github.com/async-profiler/async-profiler/releases/download/v3.0/async-profiler-3.0-macos.zip
unzip async-profiler-3.0-macos.zip

export LD_LIBRARY_PATH=/workspace/101-jmh/async-profiler-3.0-linux-x64/lib/libasyncProfiler.so:$LD_LIBRARY_PATH
echo $LD_LIBRARY_PATH
java -jar async-profiler-3.0-linux-x64/lib/async-profiler.jar -i /workspace/101-jmh/jfr/org.jab.java.BenchmarkLoop.loopFor-AverageTime/profile.jfr -o flamegraph.html

uname -m
lscpu
arch
cat /proc/cpuinfo

./async-profiler-3.0-macos/bin/asprof -d 30 -f ${PWD}/docs/flamegraph.html 52566
```
