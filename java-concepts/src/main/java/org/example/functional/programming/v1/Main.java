package org.example.functional.programming.v1;

import java.util.*;

public class Main {

    public static void printOddNumbers(List<Integer> numbers) {
        numbers.stream().filter(number -> number % 2 != 0).forEach(System.out::println);
    }

    public static void printCourses(List<String> courses) {
        courses.stream().forEach(System.out::println);
    }

    public static void printSpringCourses(List<String> courses) {
        courses.stream().filter(course->course.contains("Spring")).forEach(System.out::println);
    }

    public static void printCourseWithLength4(List<String> courses) {
        courses.stream().filter(course->course.length()==4).forEach(System.out::println);
    }

    public static void printSquares(List<Integer> numbers) {
        numbers.stream().map(number->number*number).forEach(System.out::println);
    }

    public static void printOddCubes(List<Integer> numbers) {
        numbers.stream().filter(number->number%2!=0).map(number->number*number*number).forEach(System.out::println);
    }

    public static void printCoursesLength(List<String> courses) {
        courses.stream().map(course->course+":"+course.length()).forEach(System.out::println);
    }

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10);
        List<String> courses=List.of("Spring","Spring Boot","AWS","Java","Swimming","Ethical Hacking");
        //printOddNumbers(numbers);
        //printCourses(courses);
        //printSpringCourses(courses);
        //printCourseWithLength4(courses);
        //printSquares(numbers);
        //printOddCubes(numbers);
        printCoursesLength(courses);
    }
}
