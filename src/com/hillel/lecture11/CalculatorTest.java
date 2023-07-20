package com.hillel.lecture11;

public class CalculatorTest {
    public static void main(String[] args) {
        CalculatorTest instance = new CalculatorTest();
        System.out.println("add: " + instance.add());
        System.out.println("divide: " + instance.divide());
    }

    public boolean add() {
        // given
        Calculator calculator = new Calculator();

        // when
        calculator.add(10);

        // then
        return calculator.getResult() == 10;
    }

    public boolean divide() {
        // given
        Calculator calculator = new Calculator(10);

        // when
        calculator.divide(3);

        //then
        return calculator.getResult() == 3;
    }
}
