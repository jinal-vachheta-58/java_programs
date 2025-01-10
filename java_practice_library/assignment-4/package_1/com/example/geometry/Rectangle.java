package com.example.geometry;
public class Rectangle {
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