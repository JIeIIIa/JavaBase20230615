package com.hillel.lecture08;

public class Device {
    private String name;
    String imei = "1111";
    protected String color;


    public Device(String name, String imei) {
        System.out.println("Constructor with String parameter");
        this.imei = imei;
        this.name = name;
    }

    public Device(String name, String imei, String color) {
        this.imei = imei;
        this.color = color;
    }

    public void printInfo() {
        System.out.println("General info: imei " + imei);
        System.out.println("\t\tcolor " + color);
    }

    public void printInfo(String prefix) {
        printInfo(prefix, 0);
//        System.out.println(prefix + ": Extended information");
    }

    public void printInfo(String prefix, int suffix) {
        System.out.println(prefix + ": Extended information " + suffix);
    }


    public void printInfo(int suffix, String prefix) {
        System.out.println(prefix + ": Extended information " + suffix);
    }
}

class Phone extends Device {
    public Phone() {
        super("defaultPhoneName", "default phone imei");
//        this.name = "prettyName"; // private access modifier
        color = "gold";
    }
}