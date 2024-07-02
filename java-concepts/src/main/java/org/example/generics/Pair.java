package org.example.generics;

import java.util.ArrayList;
import java.util.List;

public class Pair<T,U> {
    T x;
    U y;

    public Pair(T x, U y) {
        this.x=x;
        this.y=y;
    }

    public void printPair() {
        System.out.println("("+x+","+y+")");
    }

    static <X extends Number,Y extends Number> int sum(X x, Y y) {
        return x.intValue()+y.intValue();
    }

    static void printList(List<? super Integer> list) {
        System.out.println(list);
    }
}
