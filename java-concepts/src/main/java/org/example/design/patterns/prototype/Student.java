package org.example.design.patterns.prototype;

import lombok.Setter;

@Setter
public class Student implements Cloneable {
    private int id;
    private String name;
    private int age;
    private String address;

    public Student() {

    }
    Student(Student student) {
        this.id=student.id;
        this.name=student.name;
        this.age=student.age;
        this.address= student.address;;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }

}
