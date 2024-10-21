//3. Create a Circle class with the following properties: radius. Implement methods to calculate the area and circumference(perameter) of the circle.

import java.util.Scanner;

public class Circle {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        Circle cr = new Circle(radius);
        
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + cr.calculateArea());
        System.out.println("Circumference: " + cr.calculateCircumference());

        sc.close();
    }
}


/*

Enter the radius of the circle: 2
Radius: 2.0
Area: 12.566370614359172
Circumference: 12.566370614359172

*/
