package com.hillel.lecture09;

public class WrapperDemo {
    public static void main(String[] args) {
        int a = 10;
        Integer b = new Integer(10);
        char ch = ' ';
        Character c = new Character('t');

        Integer result = new Integer(a + b.intValue());

//        b = 20;
        System.out.println(result);

        npeDemo(42, null);
    }

    public static void npeDemo(int a, Integer b) {
        System.out.println("Result: " + (a + b));
    }

}
