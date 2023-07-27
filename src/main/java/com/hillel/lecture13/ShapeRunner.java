package com.hillel.lecture13;

import com.hillel.lecture13.Triangle.Edge;

public class ShapeRunner {
    public static void main(String[] args) {
        Edge[] edges = {
                new Edge("A-B"),
                new Edge("A-C"),
                new Edge("B-C")};

        Triangle triangle = new Triangle("black", "first Triangle", edges);
        System.out.println(triangle);
    }
}
