/*Q: Write a program to check the number is even or odd. Input is taken from keyboard. */

import java.util.Scanner;

public class q7{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }
        sc.close();
    }
}

/*
 Z:\java(sessional-1)\problem statement>java q7
Enter an integer: 65
65 is odd.
 */
