package com.hillel.lecture10;

public abstract class Person {
    private String name;

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
        return "i'm a person. My name is " + name;
    }

    public abstract String solveExpression(String expression);
}
