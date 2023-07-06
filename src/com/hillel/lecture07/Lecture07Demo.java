package com.hillel.lecture07;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

public class Lecture07Demo {

    public static void main(String[] args) {
        task1Simplify();

    }

    // N / 2  = 0.5 * N
    // O(N)
    private static int[] generate(int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = ThreadLocalRandom.current().nextInt(10);
        }

        return array;
    }

    private static void print(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] array) {
        for (int j = 0; j < array.length - 1; j++) {
            for (int i = 0; i < array.length - 1 - j; i++) {
                if (array[i] > array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
        }
    }


    public static void bubbleSortReverse(int[] array) {
        System.out.println("Bubble sort reverse starting...");
        for (int j = array.length - 2; j >= 0; j--) {
            for (int i = array.length - 1 - j - 1; i >= 0; i--) {
                if (array[i] < array[i + 1]) {
                    swap(array, i, i + 1);
                }
            }
            print(array);
        }
        System.out.println("Bubble sort reverse finished");
        print(array);
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    /**
     * a. Задати масив цілих чисел довжини N елементів та заповнити його рандомними числами
     * відсортувати масив та вивести на екран. Поміняти місцями перший та останній елемент, вивести масив на екран ще раз.
     */
    public static void task1() {
        int[] array = generate(15);
        System.out.println("Generated array:");
        print(array);

        System.out.println("Sorted array:");
        bubbleSort(array);
        print(array);

        System.out.println("Changed the first and last elements:");
        swap(array, 0, array.length - 1);
        print(array);
    }


    public static void task1Simplify() {
        int[] array = generate(20);
        System.out.println("Generated array:");
        System.out.println(Arrays.toString(array));

        System.out.println("Sorted array:");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int index = Arrays.binarySearch(array, 1);
        System.out.println("Found index: " + index);
//
        System.out.println("Changed the first and last elements:");
        swap(array, 0, array.length - 1);
        print(array);
    }

    /**
     * Створити масив з рендомних чисел довжини N (N вводимо з консолі; N має бути парним числом)
     * Розбити масив на 2 масиви рівної довжини
     * Відсортувати першу половину масива за зростанням та вивести на екран
     * Відсортувати другу частину масивав за спаданням і також вивести на екран
     */
    public static void task2() {


    }
}
