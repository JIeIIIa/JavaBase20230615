package com.hillel.lecture12;

public class Calculator {
    private long result;

    public Calculator() {

    }

    public Calculator(long initialValue) {
        this.result = initialValue;
    }

    public long getResult() {
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

    // n! == 1*2*...*(n-1)*n
    // 0! == 1

    // n! = n*(n-1)!
    public long factorial(int n) {
        long result;
        if (n < 0) {
            this.result = 0;
            return 0;
        }
        if (n > 0) {
            result = n * factorial(n - 1);
        } else {
            this.result = 1;
            return 1;
        }

        this.result = result;
        return this.result;
    }
}
