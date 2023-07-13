package com.hillel.lecture09;

public class Plane {
    private String model;
    private int speed;
    private final int year;
    private int year1; // modificationYear
    private int altitude;

    private static int count = 0;

    public Plane(String model, int year) {
        Plane.count++;
        this.model = model;
        this.year = year;
    }


    public void setSpeed(int speed) {
        if (speed < 0 || speed > 1000) {
            System.out.println("Wrong speed!!!");
            return;
        }
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    public static int getCount() {
        return count;
    }

    public void statistics() {
        System.out.println("Model: " + model + " (year = " + year + ")");
        System.out.println("\tSpeed: " + speed);
        System.out.println("\tAltitude: " + altitude);
    }

    public void changeSpeed(String speed) {
        setSpeed(Integer.parseInt(speed));
    }
}
