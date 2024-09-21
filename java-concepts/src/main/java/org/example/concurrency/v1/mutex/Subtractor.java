package org.example.concurrency.v1.mutex;

public class Subtractor extends Thread {

    private SharedResource sharedResource;

    public Subtractor(SharedResource sharedResource) {
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;++i) {
            sharedResource.subtract();
        }
    }
}
