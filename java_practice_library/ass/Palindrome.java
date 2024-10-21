/*
 Problem 5: Palindrome Checker
Develop a program that checks whether a given string is a palindrome. The program should have the
following features:
     Prompt the user to enter a string.
 Implement a method to determine if the string is a palindrome (a word, phrase, number, or
other sequence of characters that reads the same backward as forward).
 Display the result (whether the input is a palindrome or not) to the user.
 */

import java.util.Scanner;

public class Palindrome {

  
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

       
        if (isPalindrome(input)) {
            System.out.println("The input is a palindrome.");
        } else {
            System.out.println("The input is not a palindrome.");
        }

        sc.close();
    }
}

/*
 Enter a string: khushi
The input is not a palindrome.

Enter a string: chrhc
The input is a palindrome.
 */
