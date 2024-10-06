/*check whether the no entered is
palindrome or not. */
/**
 * palindrome_num
 */
public class palindrome_num {
    public static void main(String[] args) {
        int num = 12321;
        int rev_num = 0;
        int ori_num = num;
        while(num != 0 )
        {
            int digit = num % 10;
            rev_num = (rev_num * 10) + digit;
            num = num / 10;
        }
        if (ori_num == rev_num) {
            System.out.println(ori_num + " == " + rev_num);
        }else{
            System.out.println(ori_num + " != " + rev_num);
        }
    }
}

/*output :
123 != 321
12321 == 12321
 */