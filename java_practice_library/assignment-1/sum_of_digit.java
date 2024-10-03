
/*
find the sum and multiplication of its digits.
 */
import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* sum of digit */
        System.out.println("enter num for get sum of digit : ");
        int num = input.nextInt();
        System.out.println("sum of digit : ");
        int ans1 = sum_digit(num);

        System.out.println(ans1);
        input.close();
    }

    /* sum of digit */
    public static int sum_digit(int num) {
        int ans = 0;
        while (num != 0) {
            int digit = num % 10;
            ans = ans + digit;
            num = num / 10;
        }
        return ans;
    }

}
