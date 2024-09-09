package org.example.concurrency.v1;

public class Main {

    public static void numberPrinterTest() throws InterruptedException {
        NumberPrinter numberPrinter1 = new NumberPrinter(1, 50);
        NumberPrinter numberPrinter2 = new NumberPrinter(51, 100);
        numberPrinter1.start();
        numberPrinter1.join();
        numberPrinter2.start();
    }

    public static void numberPrinterV1Test() throws InterruptedException {
        NumberPrinterV1 numberPrinter1 = new NumberPrinterV1(1, 50);
        NumberPrinterV1 numberPrinter2 = new NumberPrinterV1(51, 100);
        Thread thread1 = new Thread(numberPrinter1);
        Thread thread2 = new Thread(numberPrinter2);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
    }

    public static void main(String[] args) throws InterruptedException {
        //numberPrinterTest();
        numberPrinterV1Test();
        System.out.println(Thread.currentThread().getName() + " started!");
    }
}
