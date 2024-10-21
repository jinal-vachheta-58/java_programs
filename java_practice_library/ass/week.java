//2. Implement a program that uses a switch-case statement to determine the day of the week based on a numeric input (1 for Monday, 2 for Tuesday, etc.).

import java.util.Scanner;

public class week {
    public static void main(String[] args) {
        Scanner d = new Scanner(System.in);
        System.out.print("Enter a number (1-7) to get the day of the week: ");
        int day = d.nextInt();

        String dayName;
        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid input! ";
                break;
        }

        System.out.println("The day of the week is: " + dayName);
        d.close();
    }
}

/*

Enter a number (1-7) to get the day of the week: 5
The day of the week is: Friday

*/
