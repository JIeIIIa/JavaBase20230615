package com.hillel.lecture06;

public class Lecture06Demo {
    public static void main(String[] args) {
        int[] array = {1, 2, 4, 22, 5, 6, 4, 7};
        System.out.println(sum(100));
//        demo3();
    }

    /**
     * O(N)
     */

    // f(n) = n
    public static int sum(int n) {
        int result = 0;
        for (int i = 1; i <= n; i++) {
            result += i;
        }

        return result;
    }

    /**
     * O(N)
     */
    public static int sumRecursion(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumRecursion(n - 1);
        }
    }

    /**
     * O(N) = 3*N ~ N
     */
    public static int sum2(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sumPair(i, i + 1, 1);
        }
        return sum;
    }

    /**
     * O(1)
     */
    public static int sumPair(int a, int b, int c) {
        return a + b + c;
    }

    /**
     * O(N)
     */
    public static void demo1() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * З точки зору команд процесораа, цей варіант повільніший
     * Але BigO демонструє як себе поводить алгоритм
     * O(N)
     */

    public static void demo2() {
        int[] array = {1, 2, 3, 4, 5};
        int min = array[0];
        int max = array[0];
        for (int x : array) {
            if (x < min) {
                min = x;
            }
        }
        for (int x : array) {
            if (x > max) {
                max = x;
            }
        }
    }

    /**
     * O(N^2)
     * O(N) * O(N)
     */
    public static void demo3() {
        int n = 10;
        int steps = 0;
        for (int i = 0; i < n; i++) { // n
            for (int j = 0; j < n - 4; j++) { //
                System.out.print(i * j + " ");
                steps++;
            }
            System.out.println();
        }
        System.out.println(steps); // n*(n-4) = n^2
    }

    /**
     * O(N^3)
     */
    public static void demo4() {
        int n = 10;
        for (int i = 0; i < n; i++) { // n * (N^2)
            for (int j = 0; j < n; j++) {
                for (int l = 0; l < n; l++) {

                }
            }
        }
    }


    // 1 4 5 6 9 14 15 20 21
    // 4


    /**
     * O(logN)
     * Найгірший варіант для масива із 16 елементів
     * N = 16 - 2^4
     * N = 8 - 2^3
     * N = 4 - 2^2
     * N = 2 - 2^1
     * N = 1 - 2^0
     * <p>
     * 2^4=16 - 2^k = N тоді з математики відомо, що   k = log2N
     * O(k) = O(log2N)
     * Основа логорифма не береться до уваги, logA(N) = logB(N)/logB(A), а 1/logB(A) = константа:
     * O(k) = O(logN)
     */
    public static int demo5(int arr[], int elementToSearch) {
        int firstIndex = 0;
        int lastIndex = arr.length - 1;

        while (firstIndex <= lastIndex) {
            int middleIndex = (firstIndex + lastIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                firstIndex = middleIndex + 1;
            } else {
                lastIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
