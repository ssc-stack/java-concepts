package org.example.concurrency;

public class Adder extends Thread {
    private SharedResource sharedResource;

    public Adder(SharedResource sharedResource) {
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        for(int i=1;i<=5000;i++) {
            sharedResource.add(i);
        }
    }
}
