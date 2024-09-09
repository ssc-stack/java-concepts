package org.example.concurrency.v1;

public class NumberPrinter extends Thread {
    private int start;
    private int end;

    public NumberPrinter(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " started!");
        for (int i = start; i <= end; ++i) {
            System.out.print(i + " ");
        }
        System.out.println("\n"+threadName + " ended.");
    }
}
