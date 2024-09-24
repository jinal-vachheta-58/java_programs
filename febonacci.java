import java.util.Scanner;
class febonacci{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int a = 0; 
        int b = 1;
        int c ;
System.out.println();
System.out.println(a);
System.out.println(b);
        for(int i = 2 ;i <= x ; i++)
        {
            c = a+b;
            System.out.println(c);
            a = b;
            b = c;
        }
        input.close();
    }
}

/*
output: 
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
55

*/