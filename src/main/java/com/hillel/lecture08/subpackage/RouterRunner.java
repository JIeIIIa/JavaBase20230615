package com.hillel.lecture08.subpackage;

import com.hillel.lecture08.Device;
import com.hillel.lecture08.Phone;

public class RouterRunner {
    public static void main(String[] args) {
        Device[] devices = {new Router(), new Phone()};
        Device[] devices1 = {new Router(), new Phone()};
        for (Device device : devices) {

            devices[0].printInfo();
        }
//        devices[0].printInfo();?
        //router.pluginInternet();


    }
}
