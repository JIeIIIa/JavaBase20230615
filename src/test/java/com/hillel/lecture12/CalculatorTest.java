package com.hillel.lecture12;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    public void add() {
        // given
        Calculator calculator = new Calculator();

        // when
        calculator.add(10);
        long result = calculator.getResult();

        // then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void divide() {
        // given
        Calculator calculator = new Calculator(10);

        // when
        calculator.divide(3);
        long result = calculator.getResult();

        //then
        Assertions.assertEquals(3, result);
    }

    @Test
    void divideByZero() {
        // given
        Calculator calculator = new Calculator(10);

        // when
        calculator.divide(0);
        long result = calculator.getResult();

        //then
        Assertions.assertEquals(10, result);
    }

    @Test
    void factorial() {
        // given
        int n = 13;
        long expected = 6_227_020_800L;
        Calculator calculator = new Calculator();

        // when
        calculator.factorial(n);
        long result = calculator.getResult();

        // then
        Assertions.assertEquals(expected, result);
    }
}