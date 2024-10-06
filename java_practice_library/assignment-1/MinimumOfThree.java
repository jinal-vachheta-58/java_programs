import java.util.Scanner;

public class MinimumOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input three integers
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculate the minimum
        int min = num1;

        if (num2 < min) {
            min = num2;
        }

        if (num3 < min) {
            min = num3;
        }

        // Output the minimum number
        System.out.println("The minimum of the three numbers is: " + min);

        // Close the scanner
        scanner.close();
    }
}

/*
output: 
Enter the first number: 4
Enter the second number: 6
Enter the third number: 2
The minimum of the three numbers is: 2
 */