/*
 Problem 6: BMI Calculator
Create a program that calculates a person's Body Mass Index (BMI) and provides an interpretation of
the result. The program should have the following features:
 Prompt the user to enter their height (in meters) and weight (in kilograms).
     Calculate the BMI using the formula: BMI = weight / (height * height).
 Determine the BMI category (underweight, normal, overweight, or obese) based on the
calculated BMI.
 Display the user's BMI value and the corresponding BMI category.
 */


import java.util.Scanner;

public class BMICalculator {

    
    public static void calculateBMI(double height, double weight) {
        
        double bmi = weight / (height * height);

        String category;
        if (bmi < 18.5) {
            category = "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            category = "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            category = "Overweight";
        } else {
            category = "Obese";
        }

        System.out.printf("Your BMI is %.2f.%n", bmi);
        System.out.println("BMI Category: " + category);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your height (in meters): ");
        double height = sc.nextDouble();

        System.out.print("Enter your weight (in kilograms): ");
        double weight = sc.nextDouble();

        calculateBMI(height, weight);

        sc.close();
    }
}

/*
 Enter your height (in meters): 1.75
Enter your weight (in kilograms): 68
Your BMI is 22.20.
BMI Category: Normal weight
 */
