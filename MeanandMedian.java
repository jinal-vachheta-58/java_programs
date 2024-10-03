// Determine Mean and Median of an array.

import java.util.Arrays;
import java.util.Scanner;

public class MeanandMedian
{
    public static double Mean(int[] array){
        int sum=0;

        for(int i=0; i<array.length ; i++)
        {
            sum += array[i];
        }

        return (double) sum / array.length;
    }

    public static double Median(int[] array)
    {
        Arrays.sort(array);

        int len = array.length;

        if(len % 2 == 0)
        {
            int mid1 = len / 2 - 1;
            int mid2 = len / 2;
            
            return (array[mid1] + array[mid2] ) / 2.0 ; 
        }
        else 
        {
            int mid = len / 2;
            return array[mid];
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the Array size :");
        int size = input.nextInt();

        int[] array = new int[size];

        System.out.println("Enter the array elements :");

        for(int i=0; i<size ; i++)
        {
            array[i] = input.nextInt();
        }

        double mean = Mean(array);
        double median = Median(array);

        System.out.println("Mean :" + mean);
        System.out.println("Median :" + median);

        input.close();
    }
}