package org.example.concurrency;

public class Subtractor extends Thread {
    private SharedResource sharedResource;

    public Subtractor(SharedResource sharedResource) {
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        for(int i=1;i<=5000;i++) {
            sharedResource.subtract(i);
        }
    }
}
