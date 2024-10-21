

/*
 Problem 2: Temperature Analyzer
Create a program that analyzes temperature data. The program should have the following features:
 Allow the user to input a series of temperature readings (in Celsius).
 Calculate and display the average temperature.
 Determine and display the highest and lowest temperatures.
 Categorize the temperatures into "cold," "mild," and "hot" based on predefined
temperature ranges.
 */


import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the number of temperature readings: ");
        int n = sc.nextInt();
        
       
        double sum = 0;
        double highest;
        double lowest;

 
        System.out.println("Enter the temperature readings in Celsius:");
        System.out.print("Reading 1: ");
        double firstTemp = sc.nextDouble();
        sum += firstTemp;
        highest = firstTemp;
        lowest = firstTemp;

     
        printTemperatureCategory(firstTemp);

        for (int i = 1; i < n; i++) {
            System.out.print("Reading " + (i + 1) + ": ");
            double temp = sc.nextDouble();
            sum += temp;

            if (temp > highest) highest = temp;
            if (temp < lowest) lowest = temp;

            printTemperatureCategory(temp);
        }

        double average = sum / n;
        System.out.println("\nAverage Temperature: " + average + "°C");
        System.out.println("Highest Temperature: " + highest + "°C");
        System.out.println("Lowest Temperature: " + lowest + "°C");


        sc.close();
    }


    private static void printTemperatureCategory(double temp) {
        String category;
        if (temp < 10) {
            category = "cold";
        } else if (temp <= 25) {
            category = "mild";
        } else {
            category = "hot";
        }
        System.out.println(temp + "°C - " + category);
    }
}


/*
 
Enter the number of temperature readings: 4
Enter the temperature readings in Celsius:
Reading 1: 23
23.0°C - mild
Reading 2: 45
45.0°C - hot
Reading 3: 12
12.0°C - mild
Reading 4: 5
5.0°C - cold

Average Temperature: 21.25°C
Highest Temperature: 45.0°C
Lowest Temperature: 5.0°C

 */

