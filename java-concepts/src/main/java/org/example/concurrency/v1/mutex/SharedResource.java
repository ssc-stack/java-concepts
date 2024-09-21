package org.example.concurrency.v1.mutex;


import java.util.concurrent.locks.Lock;

public class SharedResource {
    private static int sharedValue=0;
    private Lock lock;

    public SharedResource(Lock lock) {
        this.lock=lock;
    }

    public void add() {
        lock.lock();
        sharedValue++;
        lock.unlock();
    }

    public void subtract() {
        lock.lock();
        sharedValue--;
        lock.unlock();
    }

    public int getSharedValue() {
        return sharedValue;
    }
}
