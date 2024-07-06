package org.example.functional.programming;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Number {

    private static List<Integer> numbers;

    public Number(List<Integer> numbers) {
        this.numbers=numbers;
    }

    public static void print() {
        numbers.stream().forEach(System.out::println);
    }

    public static void printEvens() {
        numbers.stream().filter(n->n%2==0).forEach(System.out::println);
    }

    public static void printOdds() {
        numbers.stream().filter(n->n%2!=0).forEach(System.out::println);
    }

    public static void printEvenSquares() {
        numbers.stream().filter(n->n%2==0).map(n->n*n).forEach(System.out::println);
    }

    public static void printOddCubes() {
        numbers.stream().filter(n->n%2!=0).map(n->n*n*n).forEach(System.out::println);
    }

    public static int sum() {
        return numbers.stream().reduce(0,Integer::sum);
    }

    public static long squareSum() {
        return numbers.stream().map(num->num*num).reduce(0,Integer::sum);
    }

    public static long cubeSum() {
        return numbers.stream().map(num->num*num*num).reduce(0,Integer::sum);
    }

    public static long oddSum() {
        return numbers.stream().filter(num->num%2!=0).reduce(0,Integer::sum);
    }

    public static long evenSum() {
        BinaryOperator<Integer> binaryOperator=new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer integer, Integer integer2) {
                return integer+integer2;
            }
        };
        return numbers.stream().filter(num->num%2==0).reduce(0,binaryOperator);
    }

    public static void printDistinctNumbers() {
        numbers.stream().distinct().forEach(System.out::println);
    }

    public static void sortInDescendingOrder() {
        numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static List<Integer> evenNumberList() {
        return numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
    }

}
