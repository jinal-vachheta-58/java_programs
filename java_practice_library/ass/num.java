/* 3. Create a program that uses a for loop to print the first 10 multiples of a given number. */

import java.util.Scanner;

 class num {
    public static void main(String[] args) {
        Scanner mul = new Scanner(System.in);

      
        System.out.print("Enter a number to print its first 10 multiples: ");
        int number = mul.nextInt();

       
        System.out.println("First 10 multiples of " + number + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        mul.close();
    }
}

/*

Enter a number to print its first 10 multiples: 5
First 10 multiples of 5:
5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
5 x 4 = 20
5 x 5 = 25
5 x 6 = 30
5 x 7 = 35
5 x 8 = 40
5 x 9 = 45
5 x 10 = 50

*/
