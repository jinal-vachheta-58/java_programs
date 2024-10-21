/*
 Problem 4: Fibonacci Sequence Generator
Write a program that generates the Fibonacci sequence. The program should have the following
features:
 Prompt the user to enter the number of Fibonacci numbers to generate.
 Use a loop to calculate and display the Fibonacci sequence up to the specified number of
terms.
 Optionally, allow the user to choose whether to display the sequence using
    a for loop, while loop, or recursive method.
 */



import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int terms = sc.nextInt();

        System.out.println("Choose the method to display the sequence:");
        System.out.println("1. For Loop");
        System.out.println("2. While Loop");
        System.out.print("Enter your choice (1/2): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                fibonacciForLoop(terms);
                break;
            case 2:
                fibonacciWhileLoop(terms);
                break;
            default:
                System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        sc.close();
    }

    public static void fibonacciForLoop(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence using for loop: ");
        for (int i = 0; i < terms; i++) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
        }
        System.out.println();
    }

    public static void fibonacciWhileLoop(int terms) {
        int a = 0, b = 1, count = 0;
        System.out.print("Fibonacci Sequence using while loop: ");
        while (count < terms) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        System.out.println();
    }
}

/*
 
Enter the number of Fibonacci numbers to generate: 5
Choose the method to display the sequence:
1. For Loop
2. While Loop
Enter your choice (1/2): 1
Fibonacci Sequence using for loop: 0 1 1 2 3

Enter the number of Fibonacci numbers to generate: 8
Choose the method to display the sequence:
1. For Loop
2. While Loop
Enter your choice (1/2): 2
Fibonacci Sequence using while loop: 0 1 1 2 3 5 8 13

 */