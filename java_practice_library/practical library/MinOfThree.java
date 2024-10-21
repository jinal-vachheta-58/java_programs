//5) write a Java program to calculate the minimum of three integer numbers:
import java.util.Scanner;

public class MinOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();
        
        System.out.print("Enter the third integer: ");
        int num3 = scanner.nextInt();
        
        int min = findMinimum(num1, num2, num3);
        
        System.out.println("The minimum of the three integers is: " + min);
        
        scanner.close();
    }

    public static int findMinimum(int a, int b, int c) {
        int min = a; 
        if (b < min) {
            min = b; 
        }
        if (c < min) {
            min = c; 
        }
        return min;
    }
}

/*
 Enter the first integer: 45
Enter the second integer: 76
Enter the third integer: 34
The minimum of the three integers is: 34   
 */
