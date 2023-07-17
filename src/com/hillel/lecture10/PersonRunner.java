package com.hillel.lecture10;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Jack");
        Student student = new Student("Jack");
        System.out.println(student.info());
    }
}
