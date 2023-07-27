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
    private int length;

    public Triangle(String color, String name) {
        super(color, name);
    }

    public Edge[] getEdges() {
        return edges;
    }

    public void setEdges(Edge[] edges) {
        this.edges = edges;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "name=" + getName() +
                ", color=" + getColor() +
                ", edges=" + Arrays.toString(edges) +
                ", totalLength=" + length +
                '}';
    }

    public class Edge {
        private String name;
        private int length;

        public Edge(String name, int length) {
            value = 42;
            this.name = name;
            this.length = length;
            Triangle.this.length += length;
        }

        @Override
        public String toString() {
            return "Edge{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }
}


