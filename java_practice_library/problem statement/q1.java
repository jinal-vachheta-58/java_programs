//Write java program to calculate the Square of a number.

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number to square: ");
        int number = sc.nextInt();
        
       int square = number * number;
        
       
        System.out.println("The square of " + number + " is " + square);
        
       
        sc.close();
    }
}

/*

Enter a number to square: 5
The square of 5 is 25

*/