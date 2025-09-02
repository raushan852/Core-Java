package com.rk.clonable;

class Student implements Cloneable {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); // Shallow copy
    }
}

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student s1 = new Student(1, "John");
        Student s2 = (Student) s1.clone();

        System.out.println(s1.id + " " + s1.name); // 1 John
        System.out.println(s2.id + " " + s2.name); // 1 John
        System.out.println(s1 == s2); // false (different objects)
    }
}
