package org.example.concurrency;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTaskRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();

        Future<String> welcomeMessage=executorService.submit(new CallableTask("Shashank"));
        Future<String> welcomeMessage2=executorService.submit(()->"Hello Janvi");
        System.out.println(welcomeMessage.get());
        System.out.println(welcomeMessage2.get());
        System.out.println("Main Exit");

        executorService.shutdown();
    }
}
