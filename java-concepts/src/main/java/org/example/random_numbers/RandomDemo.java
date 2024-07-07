package org.example.random_numbers;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        int min=150;
        int max=300;
        int random=(int)(Math.random()*(max-min))+min;
        System.out.println(random);

        Random r=new Random();
        System.out.println(r.nextInt(max-min)+min);

    }
}
