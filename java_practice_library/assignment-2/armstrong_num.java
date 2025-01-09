
import java.util.Scanner;

class armstrong_number {
    public static void main(String[] args) {
        // user input
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        int ori_num = num;
        int arm = 0;
        int len = String.valueOf(num).length();
        int digit;
        int sq = 0;
        // int sum = 0;

        while (num != 0) {
            digit = num %10;
            sq = (int)Math.pow(digit,len);

            // int x = (int)char;
            arm = arm + sq;
            num = num /10;
        }

        if( ori_num == arm)
        {
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        input.close();
    }
}

