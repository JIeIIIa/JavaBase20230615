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

        class Circle extends Shape {
            public Circle(String color, String name) {
                super(color, name);
            }

            @Override
            public String toString() {
                return "Circle{" +
                        "color='" + getColor() + '\'' +
                        ", name='" + getName() + '\'' +
                        '}';
            }
        }

        Circle circle = new Circle("green", "circle");
        System.out.println(circle);


        int speed = 10;
        Runnable human = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run, Forest, run!!!");
                System.out.println("Use minimal speed: " + speed);
            }
        };

//        speed = 42;
        human.run();
    }
}
