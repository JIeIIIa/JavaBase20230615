package com.hillel.lecture08;

public class Device {
    String imei = "1111";

    public static void main(String[] args) {
        Device device = new Device();
        device.printInfo();
        device.imei = "qwerty";
        device.printInfo();

        Device anotherDevice = new Device();
        anotherDevice.imei = "2222222";
        anotherDevice.printInfo();
        device.printInfo();
    }

    public void printInfo() {
        System.out.println("General info: imei " + imei);
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
