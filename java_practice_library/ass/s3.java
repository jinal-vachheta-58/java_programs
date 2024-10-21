/* 3. Create a program that uses a for loop to print the first 10 multiples of a given number. */

import java.util.Scanner;
public class s3{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
    System.out.println("enter a number:");
    int num = sc.nextInt();

    System.out.println("table of :"+num);
    for(int i=1;i<=10;i++)
    {
        System.out.println(num + " * " + i + " = "+ (num*i));
    }
     sc.close();
    }
}

/*

enter a number:
5
table of:5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

*/