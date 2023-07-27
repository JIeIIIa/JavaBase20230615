package com.hillel.lecture07;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class MultiDimensionality {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println("Array " + array);


        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        System.out.println("1>>");
        print(matrix);
        System.out.println("2>>");
        printTransposed(matrix);


        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        System.out.println();


        int[][] anotherMatrix = new int[3][];
        for (int i = 0; i < anotherMatrix.length; i++) {
            anotherMatrix[i] = new int[ThreadLocalRandom.current().nextInt(10)];
        }
        print(anotherMatrix);
        System.out.println("Change the first element to null");

        anotherMatrix[1] = null;
        anotherMatrix[2] = array;
//        print(anotherMatrix);
        System.out.println(Arrays.deepToString(anotherMatrix));
        System.out.println();
    }

    private static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i] == null) {
                System.out.println();
                continue;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printTransposed(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {

            for (int j = 0; j < matrix[i].length + 10; j++) {
                System.out.print(matrix[j][i] + " ");
            }
            System.out.println();
        }
    }
}
