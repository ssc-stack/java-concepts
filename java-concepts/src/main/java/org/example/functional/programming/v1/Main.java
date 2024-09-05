package org.example.functional.programming.v1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static int min(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MAX_VALUE,Integer::min);
    }

    public static int max(List<Integer> numbers) {
        return numbers.stream().reduce(Integer.MIN_VALUE,Integer::max);
    }

    public static int sum(List<Integer> numbers) {
       return numbers.stream().reduce(0,Integer::sum);
    }
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

    public static int squareSum(List<Integer> numbers) {
        return numbers.stream().map(x->x*x).reduce(0,Integer::sum);
    }

    public static int cubeSum(List<Integer> numbers) {
        return numbers.stream().map(x->x*x*x).reduce(0,Integer::sum);
    }

    public static int oddSum(List<Integer> numbers) {
        return numbers.stream().filter(x->x%2!=0).reduce(0,Integer::sum);
    }

    public static int evenSum(List<Integer> numbers) {
        return numbers.stream().filter(x->x%2==0).reduce(0,Integer::sum);
    }

    public static void printDistinct(List<Integer> numbers) {
        numbers.stream().distinct().forEach(System.out::println);
    }

    public void print(int number) {
        System.out.println(number);
    }

    public static void sortInAscendingOrder(List<String> courses) {
        courses.stream().distinct().sorted().forEach(System.out::println);
    }

    public static void sortInDescendingOrder(List<String> courses) {
        courses.stream().distinct().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }

    public static void sortByLength(List<String> courses) {
        courses.stream().distinct().sorted(Comparator.comparing(String::length)).forEach(System.out::println);
    }

    public static List<Integer> squareList (List<Integer> numbers) {
        return numbers.stream().map(x->x*x).collect(Collectors.toList());
    }

    public static void movieManager() {
        List<Movie> movies=new ArrayList<>();
        movies.add(new Movie(1,"Movie1",4));
        movies.add(new Movie(2,"Movie2",3));
        movies.add(new Movie(3,"Movie3",5));
        movies.add(new Movie(4,"Movie4",2));
        movies.add(new Movie(5,"Movie5",1));
        movies.add(new Movie(6,"Movie6",4));
        movies.add(new Movie(7,"Movie7",3));


        System.out.println(movies.stream().filter(movie->movie.getRating()>3).collect(Collectors.toList()));
        System.out.println(movies.stream().anyMatch(movie->movie.getRating()>3));
        System.out.println(movies.stream().noneMatch(movie->movie.getRating()>5));
        System.out.println(movies.stream().allMatch(movie->movie.getRating()>0));

        //movies.sort(Comparator.comparing(Movie::getRating).reversed()); List.of() return immutable list
        //movies.sort(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getId));
        //movies.forEach(System.out::println);

        System.out.println(movies.stream().max(Comparator.comparing(Movie::getRating)));
        System.out.println(movies.stream().min(Comparator.comparing(Movie::getRating)));
        System.out.println(movies.stream());
        //System.out.println(movies.stream().mapToInt(Movie::getRating).sum());

    }

    public static void main(String[] args) {
        List<Integer> numbers=List.of(1,2,3,4,5,6,7,8,9,10,10);
        List<String> courses=List.of("Spring","Spring Boot","AWS","Java","Swimming","Ethical Hacking");
        //printOddNumbers(numbers);
        //printCourses(courses);
        //printSpringCourses(courses);
        //printCourseWithLength4(courses);
        //printSquares(numbers);
        //printOddCubes(numbers);
        //printCoursesLength(courses);
       /* System.out.println(sum(numbers));
        System.out.println(min(numbers));
        System.out.println(max(numbers));
        System.out.println(squareSum(numbers));
        System.out.println(cubeSum(numbers));
        System.out.println(oddSum(numbers));
        System.out.println(evenSum(numbers));
        printDistinct(numbers);*/
        //sortInAscendingOrder(courses);
        //sortInDescendingOrder(courses);
        //sortByLength(courses);
        //System.out.println(squareList(numbers));

        movieManager();
    }
}
