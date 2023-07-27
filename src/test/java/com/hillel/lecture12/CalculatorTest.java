package com.hillel.lecture12;

import org.junit.jupiter.api.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeAll
    static void beforeAll() {
        System.out.println("Execute once before all tests");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("Execute once after all tests");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Hello from BeforeEach");
        this.calculator = new Calculator();
    }

    @AfterEach
    void tearDown() {
        System.out.println("Good bye [AfterEach]");
    }

    @Test
    @Disabled
    public void add() {
        // given

        // when
        calculator.add(10);
        long result = calculator.getResult();

        // then
        Assertions.assertEquals(10, result);
    }

    @Test
    public void divide() {
        System.out.println("Hello from TEST");
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

        // when
        calculator.factorial(n);
        long result = calculator.getResult();

        // then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void factorialWhenZero() {
        // given
        int n = 0;
        long expected = 1L;

        // when
        calculator.factorial(n);
        long result = calculator.getResult();

        // then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void factorialWhenNegative() {
        // given
        int n = -13;
        long expected = 0L;

        // when
        calculator.factorial(n);
        long result = calculator.getResult();

        // then
        Assertions.assertEquals(expected, result);
    }
}