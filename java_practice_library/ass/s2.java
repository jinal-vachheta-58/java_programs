/* 1. Write a program that takes a number as input and determines whether it is even or odd
using an if-else statement. */

import java.util.Scanner;

public class s2{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number:");
        int num = sc.nextInt();

        if(num % 2 == 0)
        {
            System.out.println(num + " is even");
        }
        else
        {
            System.out.println(num + " is odd"); 
        }

        sc.close();
    }
}

/*

enter the number:
56
56 is even

*/