package org.example.concurrency.v1;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void numberPrinterTest() throws InterruptedException {
        NumberPrinter numberPrinter1 = new NumberPrinter(1, 50);
        NumberPrinter numberPrinter2 = new NumberPrinter(51, 100);
        numberPrinter1.start();
        numberPrinter1.join();
        numberPrinter2.start();
    }

    public static void numberPrinterV1Test() throws InterruptedException {
        NumberPrinterV1 numberPrinter1 = new NumberPrinterV1(1, 50);
        NumberPrinterV1 numberPrinter2 = new NumberPrinterV1(51, 100);
        Thread thread1 = new Thread(numberPrinter1);
        Thread thread2 = new Thread(numberPrinter2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public static void executorServiceTest() throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(2);
        NumberPrinterV1 numberPrinter1 = new NumberPrinterV1(1, 50);
        NumberPrinterV1 numberPrinter2 = new NumberPrinterV1(51, 100);
        Future future1 = executorService.submit(numberPrinter1);
        Future future2 = executorService.submit(numberPrinter2);
        System.out.println(future1.isDone()+" "+future2.isDone());
        executorService.shutdown();
    }

    public static void executorServiceCallableTaskTest() throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<String> welcomeMessage=executorService.submit(()->"Hello Shashank");
        Future<String> welcomeMessage2=executorService.submit(()->"Hello Conrad");
        System.out.println(welcomeMessage.get());
        System.out.println(welcomeMessage2.get());
        System.out.println("Main Exit");
        executorService.shutdown();
    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        //numberPrinterTest();
        //numberPrinterV1Test();
        //executorServiceTest();
        executorServiceCallableTaskTest();
        System.out.println(Thread.currentThread().getName() + " started!");
    }
}
