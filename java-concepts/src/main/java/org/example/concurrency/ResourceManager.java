package org.example.concurrency;

public class ResourceManager {
    public static void main(String[] args) {
        String R1="R1";
        String R2="R2";

        Resource r1=new Resource(R1,R2);
        Resource r2=new Resource(R2,R1);
        Thread t1=new Thread(r1);
        Thread t2=new Thread(r2);
        t1.start();
        t2.start();
    }
}
