/*
 Q: Write Java program to calculate the perimeter and the area of the circle. The radius of the circle is taken as user input. Use to
different functions to calculate the perimeter and area. Define the value of PI as class constant.
 */

import java.util.Scanner;

public class q6 {

    public static final double PI = 3.14159;

    public static double Perimeter(double radius) {
        return 2 * PI * radius;
    }

    public static double Area(double radius) {
        return PI * radius * radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double perimeter = Perimeter(radius);
        double area = Area(radius);

        System.out.printf("Perimeter of the circle: %.2f%n", perimeter);
        System.out.printf("Area of the circle: %.2f%n", area);

        sc.close();
    }
}

/*
 Z:\java(sessional-1)\problem statement>java q6
Enter the radius of the circle: 5
Perimeter of the circle: 31.42
Area of the circle: 78.54

 */