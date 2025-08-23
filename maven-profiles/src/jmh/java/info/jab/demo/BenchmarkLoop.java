package info.jab.demo;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.RunnerException;

public class BenchmarkLoop {

    @State(Scope.Benchmark)
    public static class St{
        int n = 100;
        Problem problem = new Problem(n);
    }

    @Benchmark
    public void loopFor(St st) {
        st.problem.loopFor();
    }

    @Benchmark
    public void loopWhile(St st) {
        st.problem.loopWhile();
    }

    @Benchmark
    public void loopForEach(St st) {
        st.problem.loopForEach();
    }

    @Benchmark
    public void loopIterator(St st) {
        st.problem.loopIterator();
    }

    public static void main(String[] args) throws RunnerException {
        Benchmarks.run(BenchmarkLoop.class);
    }
}
