package com.hillel.lecture13;

import java.util.Arrays;

public abstract class Shape {
    private String color;
    private String name;

    public Shape(String color, String name) {
        this.color = color;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}


class Triangle extends Shape {
    private static int value;
    private Edge[] edges;

    public Triangle(String color, String name, Edge[] edges) {
        super(color, name);
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name=" + getName() +
                "color=" + getColor() +
                "edges=" + Arrays.toString(edges) +
                '}';
    }

    public static class Edge {
        private String name;

        public Edge(String name) {
            value = 42;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}


