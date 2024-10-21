/*  2. Write a program that calculates the area and perimeter of a rectangle, given the length and
width as input. */

import java.util.Scanner;

public class rec{
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        
        System.out.print("Enter length of the rectangle: ");
        double length = k.nextDouble();

        System.out.print("Enter width of the rectangle: ");
        double width = k.nextDouble();

        
        double area = length * width;
        double perimeter = 2 * (length + width);

       
        System.out.println("Area of the rectangle: " + area);
        System.out.println("Perimeter of the rectangle: " + perimeter);

        k.close();
    }
}


/*

Enter length of the rectangle: 4
Enter width of the rectangle: 6
Area of the rectangle: 24.0
Perimeter of the rectangle: 20.0

*/


