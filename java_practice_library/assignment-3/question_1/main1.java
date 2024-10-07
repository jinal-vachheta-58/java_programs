/*
1. Write a class called Statistics, which has a static method called average, which takes a one
dimensional array for double type, as parameter, and prints the average for the values in the
array.
a. Now write a class with the main method, which creates a two-dimensional array for the
four weeks of a month, containing minimum temperatures for the days of the week(an
array of 4 by 7), and uses the average method of the Statistics class to compute and
print the average temperatures for the four weeks.
*/

class main1{
    public static void main(String[] args)
    {
        double[][] weekTemperatures = {
            {18.5, 20.3, 19.8, 21.2, 22.1, 18.9, 20.0}, // Week 1
            {19.1, 21.0, 20.4, 22.2, 23.0, 19.5, 21.1}, // Week 2
            {20.0, 22.1, 21.7, 23.4, 24.0, 21.3, 22.5}, // Week 3
            {21.0, 23.0, 22.5, 24.5, 25.1, 22.0, 23.2}  // Week 4
        };

        for (int i = 0;i < weekTemperatures.length; i++)
        {
            System.out.println("Week " + (i + 1) + ":");
            Statistics.average(weekTemperatures[i]);
        }
    }
}

/*
output:
Week 1:
average : 20.114285714285717
Week 2:
average : 20.900000000000002
Week 3:
average : 22.142857142857142
Week 4:
average : 23.04285714285714
 */