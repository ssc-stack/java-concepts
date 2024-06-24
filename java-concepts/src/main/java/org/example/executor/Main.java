package org.example.executor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newCachedThreadPool();
        List<Integer> arr = Arrays.asList(102,44,22,-1,22,22,3, 1, 7, 8, 2, 4, 5, 9,2,-4,-5,12,1212);
        MutlithreadedMergeSorter mutlithreadedMergeSorter=new MutlithreadedMergeSorter(executorService,arr);
        System.out.println("Before Sorting:"+arr);
        List<Integer> sortedArr = executorService.submit(mutlithreadedMergeSorter).get();
        System.out.println("After Sorting:"+sortedArr);
        executorService.shutdown();
    }
}
