package com.hillel.lecture02;

public class Lecture02 {
    public static void main(String[] args) {
//        ints();


//        characters();
//        doubles();


        int a = 10;
        int b = 3;

        double result = (double) a / b;
        System.out.println("Result = " + result);

        System.out.println("Result: " + a + " + " + b + " = 13");
        System.out.printf("Result: %d + %d = 13", a, b);
    }

    private static void doubles() {
        double d = 3.398475000;
        float f = 3.854f;
        System.out.println(d);
        System.out.printf("Value is %.3f cm: %.10f", d, f);


        boolean flag = true;
        boolean flag1 = false;
    }

    private static void characters() {
        char ch = 'A';
        char letter = 65;

        int code = ch;

        System.out.println(ch + " " + letter);
        System.out.println("Code " + code);
    }


    private static void ints() {
        byte b = 127;
        b = (byte) (b + 1);

        System.out.println(b);


        int i = 2_147_483_647;
        i = i + 1;
        System.out.println(i);

        int first = 42;
        int second = 5;

        int result = first + second;
        System.out.println(" +: " + result);

        result = first - second;
        System.out.println(" -: " + result);

        result = first * second;
        System.out.println(" *: " + result);

        result = first / second;
        System.out.println(" /: " + result);


        i = 12;
        System.out.println(i);
        i = 0xC;
        System.out.println(i);
        i = 0b00001100;
        System.out.println(i);
        i = 014;
        System.out.println(i);
    }
}
