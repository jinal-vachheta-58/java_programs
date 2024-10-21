//Write java program to multiply two numbers, numbers should be taken from standard input.
import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

         System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        int  product = num1 * num2;
        System.out.printf("The product:"+ product);

         sc.close();
    }
}

/*

Enter the first number: 4
Enter the second number: 6
The product:24

*/