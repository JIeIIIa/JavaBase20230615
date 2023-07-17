package com.hillel.lecture10;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

public class Person extends AbstractPerson implements Runnable, Eatable, Solvable {
    public static final String PREFIX = "I'm a person.";

    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return PREFIX + " My name is " + name;
    }

    public String solveSimpleExpression(String expression) {
        return null;
    }

    @Override
    public void run() {
        System.out.println("Person: Running...");
    }


    @Override
    public void eat() {
        System.out.println("Person: eating...");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Person person = (Person) o;


        return Objects.equals(name, person.name);
    }


    @Override
    public int hashCode() {
        return ThreadLocalRandom.current().nextInt(100);
    }
}
