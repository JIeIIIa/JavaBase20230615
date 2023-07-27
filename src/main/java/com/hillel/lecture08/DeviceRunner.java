package com.hillel.lecture08;

public class DeviceRunner {
    public static void main(String[] args) {
        String test = "test";
        System.out.println(test);
        Device device = new Device("qwerty", "white");
        device.printInfo();
//        device.printInfo();

        Device anotherDevice = new Device("secondDevice", "222222");
        anotherDevice.printInfo();

        System.out.println("PHONES");
        Phone phone = new Phone();
        phone.color = "blue";
        phone.imei = "imei"; // package-private or default
        phone.printInfo();
    }
}
