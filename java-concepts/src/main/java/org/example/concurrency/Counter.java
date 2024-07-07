package org.example.concurrency;

public class Counter {
    private int i;

    public Counter() {

    }

    public Counter(int i) {
        this.i=i;
    }

    public void increment() {
        i++;
    }

    public int getI() {
        return i;
    }
}
