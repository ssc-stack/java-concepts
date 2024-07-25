package org.example.design.patterns.builder;

public class Student {
    private int id;
    private String name;
    private int age;
    private String address;

    private Student(Builder builder) {
        this.id=builder.id;
        this.name=builder.name;
        this.age=builder.age;
        this.address=builder.address;
    }

    public static Builder getBuilder() {
        return new Builder();
    }

    static class Builder {

        private int id;
        private String name;
        private int age;
        private String address;

        public Student build() {
            return new Student(this);
        }

        public Builder setId(int id) {
            this.id = id;
            return this;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAddress(String address) {
            this.address = address;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }
}
