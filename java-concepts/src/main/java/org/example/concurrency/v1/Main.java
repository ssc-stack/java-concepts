package org.example.concurrency.v1;

public class Main {

    public static void numberPrinterTest() throws InterruptedException {
        NumberPrinter numberPrinter1 = new NumberPrinter(1, 50);
        NumberPrinter numberPrinter2 = new NumberPrinter(51, 100);
        numberPrinter1.start();
        numberPrinter1.join();
        numberPrinter2.start();
    }

    public static void main(String[] args) throws InterruptedException {
        numberPrinterTest();
    }
}
