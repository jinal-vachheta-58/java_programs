/* 4. Write a program that uses a while loop to calculate the factorial of a given number. */


import java.util.Scanner;

public class fac{
    public static void main(String[] args) {
        Scanner fec = new Scanner(System.in);

        System.out.print("Enter a num  to calculate its factorial: ");
        int number = fec.nextInt();

        if (number < 0) {
            System.out.println("Error: Factorial is not possible for negative numbers.");
        } else {
            
            int factorial = 1;
            int i = 1;

            while (i <= number) {
                factorial = factorial * i;
                i++;
            }

            System.out.println("Factorial of " + number + " is: " + factorial);
        }

        fec.close();
    }
}

/*

Enter a num  to calculate its factorial: 5
Factorial of 5 is: 120

*/
