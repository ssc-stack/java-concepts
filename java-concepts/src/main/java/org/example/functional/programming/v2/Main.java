package org.example.functional.programming.v2;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void printNumbers(int number) {
        System.out.print(number+" ");
    }

    public static void printEvenNumbers(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==0).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        //numbers.stream().forEach(Main::printNumbers);
        //numbers.stream().forEach(number-> System.out.print(number+" "));
        //numbers.stream().forEach(System.out::println);
        //printEvenNumbers(numbers);
    }
}
