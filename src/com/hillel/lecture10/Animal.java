package com.hillel.lecture10;

public class Animal implements Runnable {
    @Override
    public void run() {
        System.out.println("Animal: running...");
    }
}
