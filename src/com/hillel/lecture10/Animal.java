package com.hillel.lecture10;

public class Animal implements Runnable, Eatable {
    @Override
    public void run() {
        System.out.println("Animal: running...");
    }

    @Override
    public void eat() {
        System.out.println("Animal: eating...");
    }
}
