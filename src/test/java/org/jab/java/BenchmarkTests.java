package org.jab.java;

import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.profile.*;
import org.openjdk.jmh.results.format.ResultFormatType;
import org.openjdk.jmh.runner.Runner;
import org.openjdk.jmh.runner.RunnerException;
import org.openjdk.jmh.runner.options.Options;
import org.openjdk.jmh.runner.options.OptionsBuilder;
import org.openjdk.jmh.runner.options.TimeValue;

import java.util.concurrent.TimeUnit;

public class BenchmarkTests {

    @Test
    public void given_jmh_when_executeBenchmark_then_ok() throws RunnerException {

        Options options = new OptionsBuilder()
                .include(BenchmarkLoop.class.getSimpleName())
                .resultFormat(ResultFormatType.JSON)
                .result("target/jmh-results.json")
                //.verbosity(VerboseMode.EXTRA)
                .mode(Mode.AverageTime)
                .timeUnit(TimeUnit.MILLISECONDS)
                .warmupTime(TimeValue.seconds(5))
                .measurementTime(TimeValue.milliseconds(1))
                .measurementIterations(2)
                .threads(Runtime.getRuntime().availableProcessors())
                .warmupIterations(3)
                //.shouldFailOnError(true)
                .shouldDoGC(true)
                .forks(1)
                .jvmArgs("-Xmx6144m", "-Xms6144m")

                //https://github.com/openjdk/jmh/tree/master/jmh-core/src/main/java/org/openjdk/jmh/profile
                .addProfiler(StackProfiler.class)
                .addProfiler(GCProfiler.class)
                //.addProfiler(AsyncProfiler.class, "output=flamegraph.html")
                //.addProfiler(LinuxPerfProfiler.class)
                .addProfiler(ClassloaderProfiler.class)
                .addProfiler(CompilerProfiler.class)
                .addProfiler(JavaFlightRecorderProfiler.class, "dir=./jfr")
                .build();

        new Runner(options).run();
    }

}
