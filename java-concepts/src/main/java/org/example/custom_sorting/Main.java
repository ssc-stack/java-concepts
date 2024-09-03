package org.example.custom_sorting;

import java.util.*;

public class Main {

    private static void comparableDemo() {
        Student s1=new Student("John", 20);
        Student s2=new Student("Doe", 25);
        Student s3=new Student("Smith", 22);
        Student s4=new Student("Alice", 18);

        List<Student> students = new ArrayList<>();
        students.add(s1);
        students.add(s2);
        students.add(s3);
        students.add(s4);

        //Collections.sort(students,Comparator.comparing(Student::getAge));
        students.sort(Comparator.comparing(Student::getName).reversed());
        for(Student student: students){
            System.out.println(student);
        }
    }

    public static void main(String[] args) {
        comparableDemo();
    }
}
