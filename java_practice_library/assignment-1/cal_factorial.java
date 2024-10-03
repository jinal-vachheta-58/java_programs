/*
4) Write and run a Java program to calculate factorial and the 

 */

import java.util.Scanner;

public class cal_factorial {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int ans_factorial = cal_factorial.calculate_factorial(num);
        System.out.println(ans_factorial);
        input.close();
    }

    /* Write and run a Java program to calculate factorial */
    public static int calculate_factorial(int num) {
        int i = 1;
        int fact = 1;
        while (i != num + 1) {
            fact = fact * i;
            i++;
        }
        return fact;
    }
}

/*
 * output:
 * 5
 * 120
 */
