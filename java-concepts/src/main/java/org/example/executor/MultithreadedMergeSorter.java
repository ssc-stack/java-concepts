package org.example.executor;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MultithreadedMergeSorter implements Callable<List<Integer>>{
    private ExecutorService executorService;
    private List<Integer> arr;

    public MultithreadedMergeSorter(ExecutorService executorService, List<Integer> arr) {
        this.executorService=executorService;
        this.arr=arr;
    }

    @Override
    public List<Integer> call() throws Exception {

        // 1. Create a left and right array
        // 2. Sort them individually
        // 3. Merge both the results and return.

        System.out.println("Thread " + Thread.currentThread().getName() + " Arr to sort: " + arr);

        if(arr.size()<=1) return arr;
        int low=0;
        int high=arr.size()-1;
        int mid=low+(high-low)/2;

        List<Integer> left=arr.subList(low,mid+1);
        List<Integer> right=arr.subList(mid+1,high+1);

        MultithreadedMergeSorter leftTask=new MultithreadedMergeSorter(executorService,left);
        MultithreadedMergeSorter rightTask=new MultithreadedMergeSorter(executorService,right);

        Future<List<Integer>> leftListFuture = executorService.submit(leftTask);
        Future<List<Integer>> rightListFuture = executorService.submit(rightTask);

        List<Integer> sortedLeft = leftListFuture.get();
        List<Integer> sortedRight = rightListFuture.get();

        System.out.println("Thread JOINING: " + Thread.currentThread().getName());
        System.out.println("Sorted left: " + sortedLeft);
        System.out.println("Sorted right " + sortedRight);//

        List<Integer> result=merge(sortedLeft,sortedRight);
        return result;
    }

    public static List<Integer> merge(List<Integer> sortedLeft, List<Integer> sortedRight) {
        List<Integer> result = new ArrayList<>();

        int i = 0, j = 0;

        // Compare elements from sortedLeft and sortedRight, add the smaller one to result
        while (i < sortedLeft.size() && j < sortedRight.size()) {
            if (sortedLeft.get(i) < sortedRight.get(j)) {
                result.add(sortedLeft.get(i));
                i++;
            } else {
                result.add(sortedRight.get(j));
                j++;
            }
        }

        // Append remaining elements from sortedLeft
        while (i < sortedLeft.size()) {
            result.add(sortedLeft.get(i));
            i++;
        }

        // Append remaining elements from sortedRight
        while (j < sortedRight.size()) {
            result.add(sortedRight.get(j));
            j++;
        }

        return result;
    }
}
