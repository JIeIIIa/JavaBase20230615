package com.hillel.lecture11;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    public void add() {
        // given
        Calculator calculator = new Calculator();

        // when
        calculator.add(10);
        int result = calculator.getResult();

        // then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void divide() {
        // given
        Calculator calculator = new Calculator(10);

        // when
        calculator.divide(3);
        int result = calculator.getResult();

        //then
        Assertions.assertEquals(3, result);
    }

    @Test
    void divideByZero() {
        // given
        Calculator calculator = new Calculator(10);

        // when
        calculator.divide(0);
        int result = calculator.getResult();

        //then
        Assertions.assertEquals(10, result);
    }
}