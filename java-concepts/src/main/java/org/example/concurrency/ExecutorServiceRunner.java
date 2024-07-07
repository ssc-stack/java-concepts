package org.example.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {
    public static void main(String[] args) {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        Task t1=new Task(1,10);
        Task t2=new Task(11,25);
        //executorService.submit(t1,t2);
        executorService.execute(t1);
        executorService.execute(t2);
        executorService.shutdown();
    }
}
