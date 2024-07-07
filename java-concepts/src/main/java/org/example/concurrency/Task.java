package org.example.concurrency;

public class Task extends Thread {

    private int start;
    private int end;

    public Task() {

    }

    public Task(int start,int end) {
        this.start=start;
        this.end=end;
    }

    @Override
    public void run() {
        String threadName=Thread.currentThread().getName();
        System.out.println(threadName+" started!");
        for(int i=start;i<=end;++i) {
            System.out.print(i+" ");
        }
        System.out.println(threadName+" ended.");
    }
}
