package com.hillel.lecture09;

public class PlaneRunner {
    public static void main(String[] args) {
        int count = 0;
        Plane firstPlane = new Plane("Ruslan", 2023);
//        Plane.count++;

        firstPlane.setSpeed(new Integer(10));

        firstPlane.statistics();
        System.out.println("Speed: " + firstPlane.getSpeed());


        Plane dream = new Plane("An-225", 1985);
//        Plane.count++;
//        count++;

//        Plane.count = -1000;
        System.out.println("Were create " + Plane.getCount() + " plane(-s)");
    }
}
