package org.example.design.patterns.builder;

public class Main {
    public static void main(String[] args) {
        Student student = Student.getBuilder().
                setId(1).setName("Shashank").setAge(25).setAddress("Delhi").build();

        System.out.println(student);
    }
}
