/*2) Write a program that reads a distance in kilometers from the keyboard and output the distance
as miles. */

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter distance in kilometers: ");
        double kilometers = scanner.nextDouble();

        double miles = kilometers * 0.621371;

        System.out.printf("%.2f kilometers is equal to %.2f miles.%n", kilometers, miles);

        scanner.close();
    }
}

/*
 Enter distance in kilometers: 5
5.00 kilometers is equal to 3.11 miles.
 */
