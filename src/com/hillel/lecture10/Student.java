package com.hillel.lecture10;

public class Student extends Person implements AdvanceSolvable {
    public static final String PREFIX = "I'm a student.";
//    private String name;

    public Student(String name) {
        super(name);
        this.name = "new name is " + super.name;
    }

    public String info() {
        return PREFIX + " My name is " + name;
    }

    @Override
    public String solveSimpleExpression(String expression) {
        return "Answer is " + expression;
    }

    @Override
    public String solveIntegral(String expression) {
        return "Solving integral:" + expression;
    }
}
