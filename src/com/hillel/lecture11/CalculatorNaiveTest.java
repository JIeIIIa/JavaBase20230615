package com.hillel.lecture11;

public class CalculatorNaiveTest {
    public static void main(String[] args) {
        CalculatorNaiveTest instance = new CalculatorNaiveTest();
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
