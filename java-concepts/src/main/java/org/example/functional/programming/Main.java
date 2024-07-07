package org.example.functional.programming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.function.*;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class Main {

    public static void numberHelper() {
        List<Integer> number= Arrays.asList(1,2,4,5,6);
        Number numberPrinter=new Number(Arrays.asList(1,2,4,5,6,5,7,5,5,1));
        //numberPrinter.print();
        //numberPrinter.printEvens();
        //numberPrinter.printOdds();
        //numberPrinter.printEvenSquares();
        //numberPrinter.printOddCubes();
        //System.out.println(numberPrinter.sum());
        //System.out.println(numberPrinter.squareSum());
        //System.out.println(Number.cubeSum());
        //System.out.println(Number.evenSum());
        //System.out.println(Number.oddSum());
        //Number.printDistinctNumbers();
        //Number.sortInDescendingOrder();
        //System.out.println(Number.evenNumberList());

        IntStream.range(1,11).peek(System.out::println).sum();
        //IntStream.iterate(1,e->e+100000000).peek(System.out::println).sum(); // Infinite Loop
        System.out.println(LongStream.rangeClosed(1,500).mapToObj(BigInteger::valueOf).reduce(BigInteger::multiply));
    }

    public static void courseHelper() {
        List<String> courseList=List.of("Spring","Spring","spring","Spring Boot","AWS","Java","Swimming","Ethical Hacking","AWS");
        Course course=new Course(courseList);


        //course.printAll();
        //course.printSpringCourses();
        //course.printCoursesWithMoreThan4Letters();
        //course.printCoursesLength();
        //Course.sortCourses();
        //Course.sortedDistinctCourses();
        //Course.sortbasedOnLength();
        System.out.println(Course.courseLengths());
    }

    public static void someOtherFunctionalInterfaces() {
        Supplier<Integer> supplier=()->1998;
        System.out.println(supplier.get());
        BiPredicate<String,Integer> biPredicate=(x,y)->x.length()==y;
        System.out.println(biPredicate.test("shashank",8));
        BiConsumer<String,Integer> biConsumer=(name,age)-> System.out.println("My name is "+name+" and I am "+age+
                " years old.");
        biConsumer.accept("Shashank",25);

        BiFunction<String,Integer,String> biFunction=(x,y)->x+":"+y;
        System.out.println(biFunction.apply("Shashank",25));
    }

    public static void main(String[] args) {
        numberHelper();
        //courseHelper();
        //someOtherFunctionalInterfaces();
        //,UnaryOperator, BiPredicate, BiConsumer, BiFunction
    }
}
