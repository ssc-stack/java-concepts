package org.example.concurrency.v1.mutex;

public class Adder extends Thread {

    private SharedResource sharedResource;

    public Adder(SharedResource sharedResource) {
        this.sharedResource=sharedResource;
    }

    @Override
    public void run() {
        for(int i=1;i<=100;++i) {
            sharedResource.add();
        }
    }
}
