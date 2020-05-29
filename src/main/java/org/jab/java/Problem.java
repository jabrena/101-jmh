package org.jab.java;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Problem {

    private final int N;
    private final List<String> DATA_FOR_TESTING;

    public Problem(int N) {
        this.N = N;
        DATA_FOR_TESTING = createData();
    }

    private List<String> createData() {
        List<String> data = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            data.add("Number : " + i);
        }
        return data;
    }

    public void loopFor() {
        for (int i = 0; i < DATA_FOR_TESTING.size(); i++) {
            String s = DATA_FOR_TESTING.get(i); //take out n consume, fair with foreach
        }
    }

    public void loopWhile() {
        int i = 0;
        while (i < DATA_FOR_TESTING.size()) {
            String s = DATA_FOR_TESTING.get(i);
            i++;
        }
    }

    public void loopForEach() {
        for (String s : DATA_FOR_TESTING) {
            //
        }
    }

    public void loopIterator() {
        Iterator<String> iterator = DATA_FOR_TESTING.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            //
        }
    }

}
