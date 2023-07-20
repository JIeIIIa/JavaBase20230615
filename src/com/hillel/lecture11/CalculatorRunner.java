package com.hillel.lecture11;

public class CalculatorRunner {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.add(10);
        System.out.println("0 + 10 = " + calculator.getResult());

        calculator.divide(3);
        System.out.println("result / 3 = " + calculator.getResult());
    }
}
