package org.example.concurrency.v1.mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResourceManager {
    public static void main(String[] args) {
        Lock lock=new ReentrantLock();
        SharedResource sharedResource=new SharedResource(lock);
        Adder adder=new Adder(sharedResource);
        Subtractor subtractor=new Subtractor(sharedResource);

        adder.start();
        subtractor.run();

        try {
            adder.join();
            subtractor.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(sharedResource.getSharedValue());

    }
}
