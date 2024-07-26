package org.example.design.patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        IceCream iceCream=new OrangeCone(new VanillaScoop
                (new ChocolateScoop(new ChocolateCone(new OrangeCone()))));

        System.out.println(iceCream.getDescription());
    }
}
