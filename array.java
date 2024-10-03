// Display an array. (Use for each version of loop for display).

import java.util.Scanner;

class array{

    public static void main(String args[])
    {
         Scanner a = new Scanner(System.in);
         System.out.println("Enter the array size :");
         
         int size = a.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the "+ size + " element of array :");

        for(int i=0; i<size; i++)
        {
            arr[i]=a.nextInt();
        }

        System.out.println("The " +size+" element of array are :");

        // for-each array

        for(int number : arr)
        {
            System.out.println(number);
        }
        
        a.close();
    }
}