/*
b. Step-2 :
i. Define a class called Triangle, which has constructor with three parameters,
which are of type Cartesian Point.
ii. Provide methods
1. to find the area and the perimeter of the Triangle,
2. a method display() to display the three Cartesian Points separated by ':'
character,
3. a method move() to move the first Cartesian Point to the specified x, y
location, the move should take care of relatively moving the other
points as well,
4. a method called rotate, which takes two arguments, one is the Cartesian
Point and other is the angle in clockwise direction.
5. Overload the move method to work with Cartesian Point as a
parameter.

iii. Now define a class called Test Triangle to test the various methods defined in
the Triangle class.


*/

public class Triangle {
    private CartesianPoint p1, p2, p3;

    public Triangle(CartesianPoint p1, CartesianPoint p2, CartesianPoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    public double area() {
        double base = distance(p1, p2);
        double height = Math.abs(p3.getY() - p1.getY()); 
        return (base * height) / 2;
    }

    public double perimeter() {
        return distance(p1, p2) + distance(p2, p3) + distance(p3, p1);
    }

    public void display() {
        System.out.println("Triangle Points: (" + p1.getX() + ", " + p1.getY() + "), "
                         + "(" + p2.getX() + ", " + p2.getY() + "), "
                         + "(" + p3.getX() + ", " + p3.getY() + ")");
    }

    private double distance(CartesianPoint a, CartesianPoint b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}

class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(new CartesianPoint(0, 0), new CartesianPoint(4, 0), new CartesianPoint(2, 3));
        triangle.display();
        System.out.println("Area: " + triangle.area());
        System.out.println("Perimeter: " + triangle.perimeter());
    }
}

/*

Triangle Points: (0, 0), (4, 0), (2, 3)
Area: 6.0
Perimeter: 11.21110255092798

*/
