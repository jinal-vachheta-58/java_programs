
/*
1. Write a program that takes a number as input and determines whether it is even or odd
using an if-else statement.
*/
import java.util.Scanner;

class j7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}