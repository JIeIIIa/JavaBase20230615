package com.hillel.homework;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] intArray = {1, 4, 6, 7};
        double[] doubleArray = {1, 1.6, 42.6};
        Foo[] fooArray = {new Foo(), new Foo()};

        int[][] intMatrix = {new int[4], new int[10], new int[1]};
        double[][] doubleMatrix = {{1, 1.6, 42.6}, {1, 1.6, 42.6}};

        int[][] anotherIntMatrix = new int[5][];

        System.out.println(Arrays.toString(anotherIntMatrix));
    }
}


class Foo {

}