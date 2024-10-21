/*  2. Write a program that calculates the area and perimeter of a rectangle, given the length and
width as input. */

import java.util.Scanner;
class s5{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the length of rectangle:");
        int length = sc.nextInt();

        System.out.println("enter the width of rectangle:");
        int width = sc.nextInt();

        int area =  length*width;
        int perimeter = 2 * (length + width);

        System.out.println("area of rectangle :"+ area);
        System.out.println("perimiter of rectangle : "+perimeter);

        sc.close();
    }
}

/*

enter the length of rectangle:
5
enter the width of rectangle:
4
area of rectangle :20
perimiter of rectangle : 18

*/