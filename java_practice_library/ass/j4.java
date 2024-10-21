/* 3. Implement a program that converts temperature from Celsius to Fahrenheit and vice versa. */

import java.util.Scanner;

public class j4 {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);

        System.out.println("Choose conversion:");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = temp.nextInt();

        double tempp, ctemp;

        

        switch (choice) {
            case 1:
              
                System.out.print("Enter temperature in Celsius: ");
                tempp = temp.nextDouble();
                ctemp = ctof(tempp);
                System.out.println("Temperature in Fahrenheit: " + ctemp);
                break;

            case 2:
              
                System.out.print("Enter temperature in Fahrenheit: ");
                tempp = temp.nextDouble();
                ctemp = ftoc(tempp);
                System.out.println("Temperature in Celsius: " + ctemp);
                break;
            default:
                System.out.println("Invalid choice. Please choose 1 or 2.");
        }

        temp.close();
    }
   
    public static double ctof(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double ftoc(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    
}

/*

Choose conversion:
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
Enter your choice (1 or 2): 1
Enter temperature in Celsius: 34
Temperature in Fahrenheit: 93.2

Choose conversion:
1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
Enter your choice (1 or 2): 2
Enter temperature in Fahrenheit: 89
Temperature in Celsius: 31.666666666666668

*/
