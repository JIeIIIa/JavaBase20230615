package com.hillel.lecture11;

public class Demo {
    private String field;

    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.field = "initial value";
        System.out.println(demo.field);

        foo(demo);

        System.out.println(demo.field);

    }

    static void foo(Demo bar) {
        bar.field = "empty value";
        bar = new Demo();
        bar.field = "new value";
    }
}
