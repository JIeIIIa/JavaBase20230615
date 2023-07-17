package com.hillel.lecture10;

public class Student extends Person {
    public Student(String name) {
        super(name);
    }

    @Override
    public String solveExpression(String expression) {
        return "Answer is " + expression;
    }
}
