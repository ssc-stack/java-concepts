package org.example.streams;

import java.util.stream.Stream;

public class ReduceDemo {
    static int getSum(Stream<Integer> stream){
        // write code here
        int sum=stream.reduce(0,(ans,el)->ans+el);
        return sum;
    }
}
