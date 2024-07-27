/*
 factorial of given number
 */

import java.util.Scanner;

class j10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int factorial = 1;
        int i = 1;
        while (i <= number) {
            factorial *= i;
            i++;
        }

        // Output the factorial
        System.out.println("Factorial of " + number + " is: " + factorial);

        scanner.close();
    }
}
