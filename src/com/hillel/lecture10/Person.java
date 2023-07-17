package com.hillel.lecture10;

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

    public String info() {
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
}
