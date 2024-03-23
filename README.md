# 101-jmh

A simple example to review JMH

## How to build?

```bash
./mvnw clean verify
./mvnw versions:display-dependency-updates
./mvnw versions:display-plugin-updates
```

## Concepts

```
@BenchmarkMode(Mode.AverageTime)
http://javadox.com/org.openjdk.jmh/jmh-core/1.12/org/openjdk/jmh/annotations/Mode.html

All
Meta-mode: all the benchmark modes.

AverageTime
Average time: average time per per operation.

SampleTime
Sample time: samples the time for each operation.

SingleShotTime
Single shot time: measures the time for a single operation.

Throughput
Throughput: operations per unit of time.

@OutputTimeUnit(TimeUnit.MILLISECONDS)
OutputTimeUnit provides the default time unit to report the results in.

@State(Scope.Benchmark)

Benchmark
Benchmark state scope.
Group
Group state scope.
Thread
Thread state scope.

@Fork(value = 2, jvmArgs = {"-Xms2G", "-Xmx2G"})
Fork annotation allows to set the default forking parameters for the benchmark.

@Warmup(iterations = 3)
Warmup annotation allows to set the default warmup parameters for the benchmark.

@Measurement
Measurement annotations allows to set the default measurement parameters for the benchmark.

```

- https://jmh.morethan.io/

## Flamegraph support

```
wget https://github.com/async-profiler/async-profiler/releases/download/v3.0/async-profiler-3.0-linux-x64.tar.gz
tar -xvf async-profiler-3.0-linux-x64.tar.gz
export LD_LIBRARY_PATH=/workspace/101-jmh/async-profiler-3.0-linux-x64/lib/libasyncProfiler.so:$LD_LIBRARY_PATH
echo $LD_LIBRARY_PATH
```

## References

- https://openjdk.java.net/projects/code-tools/jmh/
- https://www.baeldung.com/java-microbenchmark-harness
- https://github.com/async-profiler/async-profiler/releases
