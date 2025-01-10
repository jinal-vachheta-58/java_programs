/*Write an application that reads and processes strings from the console. 
Perform the following functions based on the menu choice selected by the user..
 Reverse the sequence of strings and then display it.
 Reverse the sequence of characters in each string and then display it.
 rearrange the strings according to the length of the string.
 Sorting
 Concatenation
 Change them to uppercase, lowercase depending on user’s choice. */
import java.util.Scanner;
class comman_line_str_functions {
    public static void main(String[] args) {
        String str = args[0];
        Scanner input = new Scanner(System.in);
        comman_line_str_functions fun = new comman_line_str_functions();
        int op ;
        do {
            System.out.println("1 . reverse string");
            System.out.println("2. display str");
            System.out.println("sorting");
            System.out.println("Concatenation");
            System.out.println("upper case");
            System.out.println("lower case ");
            System.out.println("toggle case");
            System.out.println();
            System.out.println("Enter option :");
            op = input.nextInt();

            switch(op)
            {
                case 1: 
                StringBuilder x = fun.reverse(str); 
                    System.out.println("______________");
                    System.out.println(x);
                    System.out.println("______________");
                    break;
            }


        } while (op != 0);
        input.close();
    }
    StringBuilder reverse(String str)
    {
        
        StringBuilder  sb = new StringBuilder();
        for(int i = str.length()-1; i>= 0 ; i--)
        {
            sb.append(str.charAt(i));
        }
        return sb;
    }
}
