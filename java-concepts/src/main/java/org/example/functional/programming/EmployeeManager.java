package org.example.functional.programming;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class EmployeeManager {
    public static void main(String[] args) {
        int[] ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] names = {"Shashank", "Aarav", "Vivaan", "Aditya", "Vihaan", "Arjun", "Sai", "Reyansh", "Ayaan", "Krishna"};
        String[] departments = {"IT", "HR", "Finance", "Marketing", "Sales", "IT", "HR", "Finance", "Marketing", "Sales"};
        int[] ages = {25, 30, 28, 35, 40, 31, 29, 27, 33, 31};

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < ids.length; i++) {
            employees.add(new Employee(ids[i], names[i], departments[i], ages[i]));
        }

        System.out.println(employees);

        //allMatch(),noneMatch(),anyMatch(),limit(),skip()
        System.out.println(employees.stream().allMatch(e->e.getAge()>18));
        System.out.println(employees.stream().allMatch(e->e.getAge()>40));
        System.out.println(employees.stream().anyMatch(e->e.getAge()>=40));
        System.out.println(employees.stream().noneMatch(e->e.getAge()>=60));

        Comparator<Employee> ageComaparator=Comparator.comparing(Employee::getAge).thenComparing(Employee::getId);
        Comparator<Employee> reversedAgeComaparator=Comparator.comparing(Employee::getAge).reversed().thenComparing(Employee::getId);
        employees.stream().sorted(reversedAgeComaparator).limit(5).forEach(System.out::println);
        System.out.println("");
        employees.stream().sorted(ageComaparator).skip(4).forEach(System.out::println);
        System.out.println();
        //takeWhile(),dropWhile()
        employees.stream().takeWhile(e->e.getAge()<=30).forEach(System.out::println);
        System.out.println();
        employees.stream().dropWhile(e->e.getAge()<=30).forEach(System.out::println);

        System.out.println();
        //min(),max(),orElse(),findFirst(),findAny()

        System.out.println(employees.stream().filter(e->e.getAge()>60).min(ageComaparator).orElse(new Employee(1,"Shashank","IT",25)));
        System.out.println(employees.stream().max(ageComaparator));
        System.out.println(employees.stream().filter(e->e.getAge()>25).findFirst());
        System.out.println(employees.stream().filter(e->e.getAge()>25).findAny());
        Optional<Integer> opt = Optional.empty();
        System.out.println(opt.orElse(100));

        System.out.println();
        //sum(),average(),count()

        System.out.println(employees.stream().filter(e->e.getAge()>30).count());
        System.out.println(employees.stream().filter(e->e.getAge()>30).mapToInt(e->e.getAge()).sum());
        System.out.println(employees.stream().filter(e->e.getAge()>30).mapToInt(e->e.getAge()).average());

        System.out.println();
        //grouping
        System.out.println(employees.stream().collect(Collectors.groupingBy(e->e.getAge(),Collectors.counting())));
        System.out.println(employees.stream().collect(Collectors.groupingBy(e->e.getName(),Collectors.counting())));
        System.out.println(employees.stream().collect(Collectors.groupingBy(e->e.getAge(),
                Collectors.minBy(Comparator.comparing(Employee::getId)))));

        System.out.println(employees.stream().collect(Collectors.groupingBy(e->e.getName(),
                Collectors.mapping(e->e.getAge(),Collectors.toList()))));

        int[] numbers={1,2,3,4,4};
        IntStream stream=Arrays.stream(numbers);
        System.out.println(stream.max());
     /*   System.out.println(stream.min());
        System.out.println(stream.sum());
        System.out.println(stream.average());*/
    }
}
