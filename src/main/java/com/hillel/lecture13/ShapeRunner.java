package com.hillel.lecture13;


public class ShapeRunner {
    public static void main(String[] args) {
        Triangle triangle = new Triangle("black", "first Triangle");
        Triangle.Edge[] edges = {
                triangle.new Edge("A-B", 2),
                triangle.new Edge("A-C", 3),
                triangle.new Edge("B-C", 5)};

        triangle.setEdges(edges);
        System.out.println(triangle);
    }
}
