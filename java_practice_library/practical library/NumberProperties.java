/*
    4) Write and run a Java program to calculate factorial and the cube of the given integer number.
Also find the sum and multiplication of its digits. Also check whether the no entered is
palindrome or not.
 */

import java.util.Scanner;

public class NumberProperties {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter an integer number: ");
        int number = scanner.nextInt();
        
        long factorial = calculateFactorial(number);

        int cube = number * number * number;

        int digitSum = 0;
        int digitProduct = 1;
        int temp = number;

        while (temp > 0) {
            int digit = temp % 10;
            digitSum += digit;
            digitProduct *= digit;
            temp /= 10;
        }

        boolean isPalindrome = checkPalindrome(number);
        
        System.out.println("Factorial of " + number + " is: " + factorial);
        System.out.println("Cube of " + number + " is: " + cube);
        System.out.println("Sum of digits: " + digitSum);
        System.out.println("Product of digits: " + digitProduct);
        System.out.println("Is the number a palindrome? " + (isPalindrome ? "Yes" : "No"));
        
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static boolean checkPalindrome(int n) {
        int original = n;
        int reversed = 0;
        
        while (n > 0) {
            int digit = n % 10;
            reversed = reversed * 10 + digit;
            n /= 10;
        }
        return original == reversed;
    }
}


/*
 Enter an integer number: 15
Factorial of 15 is: 1307674368000
Cube of 15 is: 3375
Sum of digits: 6
Product of digits: 5
Is the number a palindrome? No
 */
