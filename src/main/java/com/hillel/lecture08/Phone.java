package com.hillel.lecture08;

public class Phone extends Device {
    public Phone() {
        super("defaultPhoneName", "default phone imei");
//        this.name = "prettyName"; // private access modifier
        color = "gold";
    }
}
