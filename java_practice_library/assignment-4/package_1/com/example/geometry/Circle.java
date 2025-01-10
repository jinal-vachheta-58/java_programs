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


