/*
Q: Write a program to find out the number of days in a month using switch-case. Month number and year is taken as input through
keyboard.
*/
import java.util.Scanner;

public class q8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter month (1-12): ");
        int month = sc.nextInt();
        System.out.print("Enter year: ");
        int year = sc.nextInt();

        int days;

        switch (month) {
            case 1:  
            case 3:  
            case 5:  
            case 7:  
            case 8:  
            case 10: 
            case 12: 
                days = 31;
                break;

            case 4:  
            case 6:  
            case 9:  
            case 11: 
                days = 30;
                break;

            case 2:  
                
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                    days = 29; 
                } else {
                    days = 28; 
                }
                break;

            default:
                System.out.println("Invalid month number.");
                sc.close();
                return; 
        }

        System.out.printf("Number of days in month %d of year %d: %d%n", month, year, days);

        sc.close();
    }
}

/*
 Z:\java(sessional-1)\problem statement>java q8
Enter month (1-12): 2
Enter year: 2020
Number of days in month 2 of year 2020: 29

Z:\java(sessional-1)\problem statement>java q8
Enter month (1-12): 10
Enter year: 2024
Number of days in month 10 of year 2024: 31
 */