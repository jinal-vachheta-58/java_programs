package question_2;
/*
a. Step-1 :
i. Define a class called Cartesian Point, which has two instance variables, x and y.
Provide the following methods
1. get X() and get Y() to return the values of the x and y values respectively.
2. move() which would take two integers as parameters and change the
values of x and y respectively,
3. a method called display() which would display the current values of x
and y.

ii. Now overload the method move() to work with single parameter, which would
set both x and y to the same values, .
iii. Provide constructors with two parameters and overload to work with one
parameter as well.
iv. Now define a class called Test Cartesian Point, with the main method to test the
various methods in the Cartesian Point class.
*/

public class CartesianPoint {
    // Instance variables
    private int x;
    private int y;

    // Constructor with two parameters
    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Overloaded constructor with one parameter (sets both x and y to the same value)
    public CartesianPoint(int value) {
        this.x = value;
        this.y = value;
    }

    // Getter for x
    public int getX() {
        return x;
    }

    // Getter for y
    public int getY() {
        return y;
    }

    // Method to move the point by changing x and y with two parameters
    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    // Overloaded move method that takes a single parameter and sets both x and y to the same value
    public void move(int value) {
        this.x = value;
        this.y = value;
    }

    // Method to display the current values of x and y
    public void display() {
        System.out.println("Cartesian Point (" + x + ", " + y + ")");
    }
}
