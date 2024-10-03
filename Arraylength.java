// Write application that creates an array of double, to provide following functionality.

//  display the length of the array and its elements.

import java.util.Scanner;

public class Arraylength {
    public static void main(String args[])
    {

        Scanner input= new Scanner(System.in);

        System.out.println("Enter the size :");
        int size = input.nextInt();

        int[] num = new int[size];

        System.out.println("Enter the array size :");
        
        for(int i=0; i<size; i++)
        {
            num[i] = input.nextInt();
        }

        System.out.println("Length of the array : " + num.length);

        System.out.println("Length of the array : ");

        for(int i=0; i<num.length; i++)
        {
            System.out.println("Element of index : " + i + " : " + num[i]);
        }

        input.close();
    }
}
