package org.example.concurrency;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Task task =new Task(1,10);
        task.start();

        Task task2=new Task(11,20);
        task2.setPriority(10);
        task2.start();

        task.join();
        task2.join();
        System.out.println(Thread.currentThread().getName()+" started!");
        for(int i=21;i<=30;++i) {
            System.out.print(i+" ");
        }
        System.out.println(Thread.currentThread().getName()+" ended.");
    }
}
