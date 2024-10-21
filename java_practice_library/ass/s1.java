//2. Implement a program that uses a switch-case statement to determine the day of the week based on a numeric input (1 for Monday, 2 for Tuesday, etc.).

import java.util.Scanner;

public class s1{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number to get the day of week");
        int day = sc.nextInt();

        String dayname;

        switch(day)
        {
            case 1:
                dayname="monday";
                break;

            case 2:
                dayname="tuesday";
                break;

            case 3:
                dayname="wednesday";
                break;

            case 4:
                dayname="thuresday";
                break;

            case 5:
                dayname="friday";
                break;


            case 6:
                dayname="saturday";
                break;

            case 7:
                dayname="sunday";
                break;  

            default:
                dayname="invalid choice";
                break;                    
        }

        System.out.println("day of week:"+dayname);
        sc.close();
    }
}

/*

enter the number to get the day of week
7
day of week:sunday

*/