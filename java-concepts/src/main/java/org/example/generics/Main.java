package org.example.generics;

public class Main {
    public static void main(String[] args) {
        Pair<Integer,Integer> p1=new Pair<>(1,3);
        Pair<Double,Double> p2=new Pair<>(1.0,3.0);
        p1.printPair();
        p2.printPair();
        System.out.println(Pair.<Double,Integer>sum(2.0,2));
    }
}
