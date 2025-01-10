// Palindrome num check
import java.util.Scanner;
class Palindrome_num
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = 5454545;
        int orinum = num;
        int rev = 0;

        int digit=0;
        // reverse logic
        while(num != 0)
        {
            digit = num %10;
            rev = (rev *10 )+digit;
            num  =  num /10;
        }
        if(orinum == rev)
        {
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        input.close();
    }
}