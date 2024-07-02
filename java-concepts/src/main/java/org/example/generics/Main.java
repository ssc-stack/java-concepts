package org.example.generics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1=new Pair<>(1,3);
        Pair<Double,Double> p2=new Pair<>(1.0,3.0);
        p1.printPair();
        p2.printPair();
        System.out.println(Pair.<Double,Integer>sum(2.0,2));
        List<Integer> list= Arrays.asList(1,2,3,4,5);
        Pair.printList(list);
        int[] arr=new int[0];

    }
}
