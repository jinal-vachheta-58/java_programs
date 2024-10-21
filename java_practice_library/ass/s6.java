/* 3. Implement a program that converts temperature from Celsius to Fahrenheit and vice versa. */
import java.util.Scanner;
class s6{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.c to f");
        System.out.println("2.f to c");
        System.out.println("enter your choice");
        int choice = sc.nextInt();
        double ctemp,temp;

        switch(choice)
        {
            case 1:
                System.out.println("enter the temperature in Celsius:");
                 temp = sc.nextDouble();
                ctemp = c_to_f(temp);
                System.out.println("Temperature in Fahrenheit: " + ctemp);
                break;

            case 2:
                System.out.println("enter the temperature in fahrenheit:");
                 temp = sc.nextDouble();
                ctemp = f_to_c(temp);
                System.out.println("Temperature in Celsius: " + ctemp);
                break;

            default:
                System.out.println("invalid choice");    
                    
        }
        sc.close();
    }
    

public static double c_to_f(double celsius)
{
    return (celsius*9/5)+32;
}

public static double f_to_c(double fahrenheit)
{
    return (fahrenheit-32)*5/9;
}

}

/*

Z:\java\ass>javac s6.java

Z:\java\ass>java s6
1.c to f
2.f to c
enter your choice
1
enter the temperature in Celsius:
23
Temperature in Fahrenheit: 73.4

*/