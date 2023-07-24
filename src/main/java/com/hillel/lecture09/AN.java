package com.hillel.lecture09;

public class AN extends Plane {
    public static final int MIN_SPEED = 0;
    public static final int MAX_SPEED = 800;
    int altitude = 700;


    public AN(String model, int year) {
        super(model, year);
    }


    public int getAltitude() {
        return altitude;
    }

    @Override
    public void setAltitude(int altitude) {
        this.altitude = altitude;
        super.altitude = this.altitude;
    }

    @Override
    public void statistics() {
        super.statistics();
        System.out.println("I'm AN)");
        System.out.println(super.altitude + " " + altitude);
    }

    @Override
    public void changeSpeed(String speed) {

    }
}
