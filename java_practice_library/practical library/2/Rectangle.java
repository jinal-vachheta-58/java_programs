/*
c. Step-3 :
i. Similarly also define a class called Rectangle which has four Cartesian Point.
*/

public class Rectangle {
    private CartesianPoint p1, p2, p3, p4;

    public Rectangle(CartesianPoint p1, CartesianPoint p2, CartesianPoint p3, CartesianPoint p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    public double area() {
        return distance(p1, p2) * distance(p2, p3);
    }

    public double perimeter() {
        return 2 * (distance(p1, p2) + distance(p2, p3));
    }

    public void display() {
        System.out.printf("Rectangle Points: (%d, %d), (%d, %d), (%d, %d), (%d, %d)\n",
                          p1.getX(), p1.getY(), p2.getX(), p2.getY(), p3.getX(), p3.getY(), p4.getX(), p4.getY());
    }

    private double distance(CartesianPoint a, CartesianPoint b) {
        return Math.sqrt(Math.pow(b.getX() - a.getX(), 2) + Math.pow(b.getY() - a.getY(), 2));
    }
}

class TestRectangle {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(new CartesianPoint(0, 0), new CartesianPoint(4, 0),
                                             new CartesianPoint(4, 3), new CartesianPoint(0, 3));
        rectangle.display();
        System.out.println("Area: " + rectangle.area());
        System.out.println("Perimeter: " + rectangle.perimeter());
    }
}

/*

C:\Users\rcc\Downloads>java TestRectangle
Rectangle Points: (0, 0), (4, 0), (4, 3), (0, 3)
Area: 12.0
Perimeter: 14.0

*/
