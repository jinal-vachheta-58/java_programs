import java.util.Scanner;

class febonnaci{
    public static void main(String[] args) {
        int a =10;
        int b = 11;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter term : ");
        int n = input.nextInt();
        int i = 3;

        System.out.println(a);
        System.out.println(b);

        while(i <= n)
        {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
            i++;
        }
        input.close();
    }

}

/*
 * output:
Enter term : 
10
0
1
1
2
3
5
8
13
21
34
 */

