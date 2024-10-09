// package assignment-2;
import java.util.Scanner;
public class array_length_2 {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter :");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }

        int count = array_length_2.str_len(a);
        System.out.println(count);
        input.close();
    }

    public static int str_len(int a[])
    {
        int c = 0;
        try {            
            while (true) {
                int x = a[c];
                c++;
                // System.out.println("x : " + x + "   ->   "+"c : " + c);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            return c;
        }
    }
}