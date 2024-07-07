package org.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    private AtomicInteger sharedValue=new AtomicInteger(0);

    public void add(int value) {
        sharedValue.incrementAndGet();
    }

    public void subtract(int value) {
        sharedValue.decrementAndGet();
    }

    public int getSharedValue() {
        return sharedValue.get();
    }
}
