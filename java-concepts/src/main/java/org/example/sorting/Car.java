package org.example.sorting;

public class Car implements Comparable<Car> {
    private int price;
    private int speed;

    @Override
    public int compareTo(Car o) {
        return this.price-price;
    }
}
