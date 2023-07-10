package com.hillel.lecture08;

public class Device {
    String imei = "1111";

    public static void main(String[] args) {
        Device device = new Device();
        device.printInfo();
        device.imei = "qwerty";
        System.out.println("Imei = " + device.imei);

        Device anotherDevice = new Device();
        anotherDevice.imei = "2222222";
        System.out.println();
        System.out.println("Another device imei = " + anotherDevice.imei);
        System.out.println("Imei = " + device.imei);
    }

    public void printInfo() {
        System.out.println("General info: imei " + imei);
    }
}
