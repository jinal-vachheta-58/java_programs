/*
 2. Develop the following application in given steps.
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
    private int x;
    private int y;

    public CartesianPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public CartesianPoint(int value) {
        this.x = value;
        this.y = value;
    }

    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }

    public void move(int newX, int newY) {
        this.x = newX;
        this.y = newY;
    }

    public void move(int newValue) {
        this.x = newValue;
        this.y = newValue;
    }

    public void display() {
        System.out.println("Current Position: (" + x + ", " + y + ")");
    }
}
