
/*
find the sum and multiplication of its digits.
 */
import java.util.Scanner;

public class mul_of_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        /* sum of digit */
        System.out.println("enter num for get mul of digit : ");
        int num = input.nextInt();
        System.out.println("mul of digit : ");
        int ans1 = mul_digit(num);

        System.out.println(ans1);
        input.close();
    }


    /* mul of digit */
    public static int mul_digit(int num) {
        int ans = 1;
        while (num != 0) {
            int digit = num % 10;
            ans = ans * digit;
            num = num / 10;
        }
        return ans;
    }
}
