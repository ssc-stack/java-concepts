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

    public static void printOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number->number%2!=0).forEach(System.out::println);
    }

    public static void printEvenSquares(List<Integer> numbers) {
        numbers.stream().filter(number->number%2==0).map(number->number*number).forEach(System.out::println);
    }

    public static void printOddCubes(List<Integer> numbers) {
        numbers.stream().filter(number->number%2!=0).map(n->n*n*n).forEach(System.out::println);
    }

    public static void printCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    public static void printCoursesThatStartsWithS(List<String> courses) {
        courses.stream().filter(course->course.startsWith("S")).forEach(System.out::println);
    }

    public static void printCoursesThatHaveAtLeastFourLetters(List<String> courses) {
        courses.stream().filter(course->course.length()>=4).forEach(System.out::println);
    }

    public static void printCoursesLength(List<String> courses) {
        courses.stream().map(course->course.length()).forEach(System.out::println);
    }

    public static int addNumbers(List<Integer> numbers) {
        return numbers.stream().reduce(0,(num1,num2)->num1+num2);
    }

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        //numbers.stream().forEach(Main::printNumbers);
        //numbers.stream().forEach(number-> System.out.print(number+" "));
        //numbers.stream().forEach(System.out::println);
        //printEvenNumbers(numbers);
        //printOddNumbers(numbers);
        //printEvenSquares(numbers)
        //printOddCubes(numbers);
        List<String> courses=List.of("Java","Python","JavaScript","C++","Ruby","Rust","Go","Kotlin","Swift","Scala");
        //printCourses(courses);
        //printCoursesThatStartsWithS(courses);
        //printCoursesThatHaveAtLeastFourLetters(courses);
        //printCoursesLength(courses);
        System.out.println(addNumbers(numbers));

    }
}
