package org.example.concurrency.v1;

public class NumberPrinterV1 implements Runnable{
    private int start;
    private int end;

    public NumberPrinterV1(int start, int end) {
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
