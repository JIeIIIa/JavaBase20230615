package com.hillel.lecture08.subpackage;

import com.hillel.lecture08.Device;

public class Router extends Device {
    public Router() {
        super("router-name", "router-imei-0000");
        this.color = "black";
//        this.name = "name"; // private
//        this.imei = "qwerty"; // package-private

    }
}
