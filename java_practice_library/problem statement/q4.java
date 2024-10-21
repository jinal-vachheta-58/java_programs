//Q: Write Java program to read the three integers a, b and c from the keyboard and then print the largest value read.

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = sc.nextInt();

        System.out.print("Enter the second integer: ");
        int b = sc.nextInt();

        System.out.print("Enter the third integer: ");
        int c = sc.nextInt();

        int largest;
        
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

       System.out.println("The largest value is: " + largest);

         sc.close();
    }
}
