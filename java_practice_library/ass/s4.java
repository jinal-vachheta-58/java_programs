/* 4. Write a program that uses a while loop to calculate the factorial of a given number. */

import java.util.Scanner;
class s4{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to find the factorial:");
        int num = sc.nextInt();

        if(num<0){
            System.out.println("factorial is not possible for negative numbers");
        }
        else
        {
            int fac=1;
            int i=1;

            while(i<=num)
            {
                fac =  fac * i;
                i++;
            }

            System.out.println("factorial of "+num+ " is " +fac);
        }
        sc.close();
    }
}

/*

enter the number to find the factorial:
5
factorial of 5 is 120

*/