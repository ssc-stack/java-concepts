package org.example.functional.programming;

import java.util.stream.LongStream;

public class ParallelFunctionalProgramming {
    public static void main(String[] args) {
        long time=System.currentTimeMillis();
        //2407 milliseconds
        //System.out.println(LongStream.rangeClosed(1,1000000000).sum());
        //System.out.println(System.currentTimeMillis()-time);
        //159 milliseconds
        System.out.println(LongStream.rangeClosed(1,1000000000).parallel().sum());
        System.out.println(System.currentTimeMillis()-time);
    }
}
