package com.hillel.lecture05;

import java.util.Arrays;

public class ArgumentsDemo {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Hello, anonymous");
        } else {
            System.out.println("Hello, " + args[0]);
        }

        System.out.println("args: " + Arrays.toString(args));
    }
}
