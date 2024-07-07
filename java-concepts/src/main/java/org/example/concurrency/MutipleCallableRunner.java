package org.example.concurrency;

import org.example.generics.Pair;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MutipleCallableRunner {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        String[] predefinedNames = {"Shashank", "Aarav", "Vivaan", "Aditya", "Vihaan", "Arjun",
                "Sai", "Reyansh", "Ayaan", "Krishna", "Rohan", "Ishaan", "Dhruv", "Rudra", "Kabir"};
        ExecutorService executorService= Executors.newCachedThreadPool();

        List<Callable<String>> tasks=new ArrayList<>();
        for(String name:predefinedNames) {
            tasks.add(()->"Hello "+name);
        }

        List<Future<String>> futures=executorService.invokeAll(tasks);
        String result=executorService.invokeAny(tasks);

        System.out.println(result+"*");
        for(Future<String> future:futures) {
            System.out.println(future.get());
        }
        executorService.shutdown();




    }
}
