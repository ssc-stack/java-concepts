package org.example.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class SharedResource {
    private AtomicInteger sharedValue=new AtomicInteger(0);

    public void add(int value) {
<<<<<<< HEAD
        sharedValue.incrementAndGet();//
=======
        sharedValue.incrementAndGet();
>>>>>>> 08c646c9df5cef5c82d2dd010efe6372d437dc89
    }

    public void subtract(int value) {
        sharedValue.decrementAndGet();
    }

    public int getSharedValue() {
        return sharedValue.get();
    }
}
