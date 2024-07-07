package org.example.concurrency;

import java.util.concurrent.Callable;

public class CallableTask implements Callable<String> {

    private String name;

    public CallableTask() {

    }

    public CallableTask(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "Hello "+name;
    }
}
