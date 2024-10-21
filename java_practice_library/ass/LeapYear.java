import java.util.Scanner;

public class LeapYear {

    public static boolean isLeapYear(int year) {
       
        if (year % 400 == 0) {
            return true; 
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true; 
        } else {
            return false; 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

        sc.close();
    }
}

/*
 Enter a year: 2020
2020 is a leap year.

Enter a year: 2005
2005 is not a leap year.
 */
