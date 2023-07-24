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
    public void factorial(int n) {
        if (n < 0) {
            this.result = 0;
            return;
        }
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        this.result = result;
    }
}
