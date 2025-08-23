# Flamegraph

Flamegraphs are a visualization technique used to represent the activity of a program over time,
particularly helpful in understanding where CPU time is being spent during the execution of a program.

## Using Async-profiler to add support for Flamegrahs

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

java -cp ./async-profiler-3.0-macos/lib/converter.jar \
  jfr2flame ./jfr/org.jab.java.BenchmarkLoop.loopFor-AverageTime/profile.jfr ./docs/flame1.html
java -cp ./async-profiler-3.0-macos/lib/converter.jar \
  jfr2flame ./jfr/org.jab.java.BenchmarkLoop.loopForEach-AverageTime/profile.jfr ./docs/flame2.html
java -cp ./async-profiler-3.0-macos/lib/converter.jar \
  jfr2flame ./jfr/org.jab.java.BenchmarkLoop.loopIterator-AverageTime/profile.jfr ./docs/flame3.html
java -cp ./async-profiler-3.0-macos/lib/converter.jar \
  jfr2flame ./jfr/org.jab.java.BenchmarkLoop.loopWhile-AverageTime/profile.jfr ./docs/flame4.html

```

## References

- https://github.com/async-profiler/async-profiler/releases
- https://community.sap.com/t5/technology-blogs-by-sap/using-async-profiler-and-jattach-programmatically-with-ap-loader/ba-p/13568087

