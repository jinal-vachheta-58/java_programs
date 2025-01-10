package com.example.geometry;

public class Circle {
    private double r;

    // Constructor to initialize radius
    public Circle(double radius) {
        this.r = radius;
    }

    // Method to calculate the area of a circle
    public double area() {
        return 3.14 * r * r;
    }
}

 class Rectangle {
    private double l;
    private double b;

    // Constructor to initialize length and breadth
    public Rectangle(double len, double br) {
        this.l = len;
        this.b = br;
    }

    // Method to calculate the area of a rectangle
    public double area() {
        return l * b;
    }
}
