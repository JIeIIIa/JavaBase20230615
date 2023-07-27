package com.hillel.lecture09;

public class PlaneRunner {
    public static void main(String[] args) {
        int count = 0;
        Plane firstPlane = new Plane("Ruslan", 2023);
        firstPlane.setSpeed(10);
        firstPlane.statistics();
        System.out.println("Speed: " + firstPlane.getSpeed());


        Plane dream = new Plane("An-225", 1985);
        System.out.println("Were create " + Plane.getCount() + " plane(-s)");

        Plane an = new AN("AN", 2020);

        System.out.println("Plane max speed: " + Plane.MAX_SPEED + "    AN max speed:" + AN.MAX_SPEED);
        System.out.println("Plane altitude: " + firstPlane.altitude + "    AN altitude:" + an.altitude);
        System.out.println("Plane altitude: " + firstPlane.getAltitude() + "    AN altitude:" + an.getAltitude());
        System.out.println("Plane max speed: " + firstPlane.MAX_SPEED + "    AN max speed:" + an.MAX_SPEED);

        AN ruslan = new AN("Ruslan", 1985);


        firstPlane.statistics();
        an.statistics();
        ruslan.statistics();

    }
}
