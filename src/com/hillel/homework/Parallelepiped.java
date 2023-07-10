package com.hillel.homework;

public class Parallelepiped {
    public static void main(String[] args) {
        int width = 10;
        int height = 6;
        int depth = 42;

        int volume = width * height * depth;
        System.out.println("Volume of parallelepiped is " + volume);

        int length = 4 * (width + height + depth);
        System.out.printf("Total edges length is %d", length);
    }
}
