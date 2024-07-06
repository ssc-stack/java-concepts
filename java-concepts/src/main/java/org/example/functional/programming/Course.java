package org.example.functional.programming;

import java.util.*;
import java.util.stream.Collectors;

public class Course {

    private static List<String> courses;

    public Course(List<String> courses) {
        this.courses=courses;
    }

    public Course() {

    }

    public static void printAll() {
        courses.stream().forEach(System.out::println);
    }

    public static void printSpringCourses() {
        courses.stream().filter(c->c.contains("Spring")).forEach(System.out::println);
    }

    public static void printCoursesWithMoreThan4Letters() {
        courses.stream().filter(c->c.length()>4).forEach(System.out::println);
    }

    public static void printCoursesLength() {
        courses.stream().map(c->c+":"+c.length()).forEach(System.out::println);
    }

    public static  void sortCourses() {
        courses.stream().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    public static void sortedDistinctCourses() {
        courses.stream().distinct().sorted(Comparator.naturalOrder()).forEach(System.out::println);
    }

    public static void sortbasedOnLength() {
        courses.stream().sorted(Comparator.comparing(str->str.length())).forEach(System.out::println);
    }

    public static List<Integer> courseLengths() {
        return courses.stream().map(c->c.length()).collect(Collectors.toList());
    }
}
