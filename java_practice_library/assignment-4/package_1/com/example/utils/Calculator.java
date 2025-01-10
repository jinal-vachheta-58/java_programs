package com.example.utils;

import com.example.geometry.Circle;
import com.example.geometry.Rectangle;

public class Calculator {

    public static void main(String[] args) {
        // Circle with radius 6.0
        Circle circle = new Circle(6.0);
        System.out.println("Area of Circle: " + circle.area());

        // Rectangle with length 10.0 and breadth 5.0
        Rectangle rectangle = new Rectangle(10.0, 5.0);
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}
