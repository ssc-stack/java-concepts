package org.example.design.patterns.prototype;


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

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
