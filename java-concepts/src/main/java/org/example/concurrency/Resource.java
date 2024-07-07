package org.example.concurrency;

public class Resource implements Runnable {

    private String R1;
    private String R2;

    public Resource(String r1, String r2) {
        R1 = r1;
        R2 = r2;
    }

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        synchronized (R1) {
            System.out.println(threadName+" aquired lock on "+R1);
            synchronized (R2) {
                System.out.println(threadName+" aquired lock on "+R2);
            }
            System.out.println(threadName+" released lock on "+R2);
        }
        System.out.println(threadName+" released lock on "+R1);
    }
}
