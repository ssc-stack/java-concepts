package org.example.custom_sorting;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }


    @Override
    public int compareTo(Student s) {
        return this.age-s.age;
    }

    @Override
    public String toString() {
        return "[Name=" + this.name + ", Age=" + this.age + "]";
    }
}
