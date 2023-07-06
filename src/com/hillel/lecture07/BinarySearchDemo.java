package com.hillel.lecture07;

public class BinarySearchDemo {

    public static void main(String[] args) {
        int result = binarySearch(new int[]{1, 5, 6, 7, 8, 10, 3}, 6);
        System.out.println(result);
    }

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
    public static int binarySearch(int arr[], int elementToSearch) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;

        while (leftIndex <= rightIndex) {
            int middleIndex = (leftIndex + rightIndex) / 2;
            if (arr[middleIndex] == elementToSearch) {
                return middleIndex;
            } else if (arr[middleIndex] < elementToSearch) {
                leftIndex = middleIndex + 1;
            } else {
                rightIndex = middleIndex - 1;
            }
        }

        return -1;
    }
}
