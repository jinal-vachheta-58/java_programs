/*
1. Write a class called Statistics, which has a static method called average, which takes a one
dimensional array for double type, as parameter, and prints the average for the values in the
array.
a. Now write a class with the main method, which creates a two-dimensional array for the
four weeks of a month, containing minimum temperatures for the days of the week(an
array of 4 by 7), and uses the average method of the Statistics class to compute and
print the average temperatures for the four weeks.
*/

public class Statistics{
    static void average(double a[])
    {
        double sum = 0;
        double ele = a.length;
        for(int i = 0;i < a.length ; i++)
        {
            sum = sum + a[i];
        }
        System.out.println("average : "+sum/ele);
    }
}