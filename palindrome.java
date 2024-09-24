import java.util.Scanner;
class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        String revstr= "";
        
        for(int i = 0 ;i < str.length() ; i++)
        {
            char ch = str.charAt(i);
            revstr = ch + revstr;
        }
        System.out.println(revstr);
        if(str.equals(revstr))
        {
            System.out.println("yes it is palindrom");
        }

        else
        {
            System.out.println("no it is not palindrom");
        }

        input.close();
    }
}

/*
 output :
 madam
madam
yes it is palindrom
 */