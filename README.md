# 101-jmh

A simple example to review JMH

## How to build?

```
mvn clean test
mvn versions:display-dependency-updates
mvn versions:display-plugin-updates
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
- https://nilskp.github.io/jmh-charts/
- https://github.com/akarnokd/jmh-compare-gui

## References

- https://openjdk.java.net/projects/code-tools/jmh/
- https://www.baeldung.com/java-microbenchmark-harness

