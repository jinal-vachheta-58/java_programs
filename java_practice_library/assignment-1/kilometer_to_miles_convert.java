/*2) Write a program that reads a distance in kilometers from the keyboard and output the distance
as miles. */

public class kilometer_to_miles_convert {
    public static void main(String[] args) {
        double kilometers = 7;
        double miles = kilometer_to_miles(kilometers);
        System.out.println(miles);
    }

    public static double kilometer_to_miles(double kilometers) {
        return kilometers * 0.621371;
    }
}

// output:
// 4.349597
