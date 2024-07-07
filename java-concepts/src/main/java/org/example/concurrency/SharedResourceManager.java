package org.example.concurrency;

public class SharedResourceManager {
    public static void main(String[] args) throws InterruptedException {
        SharedResource sharedResource=new SharedResource();
        Adder adder=new Adder(sharedResource);
        Subtractor subtractor=new Subtractor(sharedResource);
        adder.start();
        subtractor.start();

        adder.join();
        subtractor.join();
        System.out.println(sharedResource.getSharedValue());

    }
}
