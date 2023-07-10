package com.hillel.lecture08;

public class Device {
    String imei = "1111";
    String color;

    public static void main(String[] args) {
        String test = "test";
        System.out.println(test);
        Device device = new Device("qwerty", "white");
        device.printInfo();
//        device.printInfo();

        Device anotherDevice = new Device("222222");
        anotherDevice.printInfo();
    }

    public Device() {
        System.out.println("Constructor with NO parameters");
    }

    public Device(String imei) {
        this();
        System.out.println("Constructor with String parameter");
        this.imei = imei;
    }

    public Device(String imei, String color) {
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
