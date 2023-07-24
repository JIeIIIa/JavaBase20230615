package com.hillel.lecture11;

public class Calculator {
    private int result;

    public Calculator() {

    }

    public Calculator(int initialValue) {
        this.result = initialValue;
    }

    public int getResult() {
        return result;
    }

    public void add(int value) {
        result += value;
    }

    public void divide(int value) {
        if (value == 0) {
            System.out.println("Error!");
            return;
        }
        result /= value;
    }
}
