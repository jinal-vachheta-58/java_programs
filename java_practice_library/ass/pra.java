/* 1. Write a program that takes a number as input and determines whether it is even or odd
using an if-else statement. */


import java.util.Scanner;

class pra {
    public static void main(String[] args) {
        Scanner k1 = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = k1.nextInt();

     
        if (number % 2 == 0) {
            System.out.println(number + " is even.");
        } else {
            System.out.println(number + " is odd.");
        }

        k1.close();
    }
}

/*

Enter a number: 56
56 is even.

*/
