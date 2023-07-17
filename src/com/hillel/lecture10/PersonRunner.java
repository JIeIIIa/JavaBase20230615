package com.hillel.lecture10;

public class PersonRunner {
    public static void main(String[] args) {
        Person person = new Person("Jack");
        Student student = new Student("Jack");
        System.out.println(student.info());

        Animal animal = new Animal();
        Runnable[] runnables = {person, animal};

        for (Runnable object : runnables) {
            object.run();
        }

    }
}
