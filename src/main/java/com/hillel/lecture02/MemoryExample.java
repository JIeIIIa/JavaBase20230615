package com.hillel.lecture02;

public class MemoryExample {
    public static void main(String[] args) {
//        int i = 1 + 34 - 32;
//        int j = 2;
//
//        String str = "I'm from String Pool";
//        String qwerty = "I'm from String Pool";
//        System.out.println("String is: " + str);
        anotherMethod();

    }

    public static void anotherMethod() {
        MemoryExample object = new MemoryExample();
        object.callMethod(15);
    }

    void callMethod(int param) {

        MemoryExample object = new MemoryExample();
        object.callMethod(15);
        object = null;

        int k = 3;
        System.out.println(param + k);
    }
}
