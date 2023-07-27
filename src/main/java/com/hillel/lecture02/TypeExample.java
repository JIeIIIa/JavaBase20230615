package com.hillel.lecture02;

public class TypeExample {
    public static void main(String[] args) {
        int i = 10;
//        chars();
//        sum();
        compare();


    }

    private static void chars() {
        char a = 'A';
        char b = 65;
        char c = '\u0041';

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }

    private static void sum() {
        float f = 0.0f;

        f += 0.111111111111111;


        f = (float) (f + 0.1111111111111111);
        f = (float) (f + 0.1111111111111111);
        f = (float) (f + 0.1111111111111111);
        f = (float) (f + 0.1111111111111111);
        f = (float) (f + 0.1111111111111111);
        f = (float) (f + 0.1111111111111111);
        f = (float) (f + 0.1111111111111111);

        //   0.7777777777777777;

        System.out.println("f = " + f);
    }


    public static void compare() {

        double f1 = 0.0;
        f1 += 0.1; // f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;
        f1 += 0.1;


        double f2 = 0.1 * 11;

        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        double eps = 0.0238947;

        if (Math.abs(f1 - f2) < eps) {
            System.out.println("f1 и f2 равны!");
        } else {
            System.out.println("f1 и f2 не равны!");
        }
    }
}
