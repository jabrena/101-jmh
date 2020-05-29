package org.jab.java;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//@State(Scope.Benchmark)
public class BenchmarkLoop {

    //@Param({"10000000"})
    //private int N;

    //private List<String> DATA_FOR_TESTING;

    @State(Scope.Benchmark)
    public static class St{
        int n = 10000000;
        Problem problem = new Problem(n);
    }

    /*
    @Setup
    public void setup() {
        DATA_FOR_TESTING = createData();
    }

     */

    @Benchmark
    public void loopFor(St st) {
        st.problem.loopFor();
        /*
        for (int i = 0; i < DATA_FOR_TESTING.size(); i++) {
            String s = DATA_FOR_TESTING.get(i); //take out n consume, fair with foreach
            bh.consume(s);
        }

         */
    }

    @Benchmark
    public void loopWhile(St st) {
        st.problem.loopWhile();
        /*
        int i = 0;
        while (i < DATA_FOR_TESTING.size()) {
            String s = DATA_FOR_TESTING.get(i);
            bh.consume(s);
            i++;
        }

         */
    }

    @Benchmark
    public void loopForEach(St st) {
        st.problem.loopForEach();
        /*
        for (String s : DATA_FOR_TESTING) {
            bh.consume(s);
        }

         */
    }

    @Benchmark
    public void loopIterator(St st) {
        st.problem.loopIterator();
        /*
        Iterator<String> iterator = DATA_FOR_TESTING.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            bh.consume(s);
        }

         */
    }

    /*
    private List<String> createData() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            data.add("Number : " + i);
        }
        return data;
    }

     */

}
