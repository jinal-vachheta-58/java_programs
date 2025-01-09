/* 1) Java Program to copy all elements of one array into another array*/
/*
 * array_copy
 */

 import java.util.Scanner;
class array_copy_to_another {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int n = input.nextInt();
    int a[] = new int[n];
    int b[] = new int[n];

    for(int i = 0; i < n; i++ )
    {
        a[i] = input.nextInt();
    }

    for(int i = 0; i < n; i++ )
    {
        b[i] = a[i] ;
    }
    
    System.out.println("-------------a[n]-------------");
    for(int j = 0; j < n; j++ )
    {
        System.out.println(a[j]);
    }

    System.out.println("-------------b[n]-------------");
    for(int j = 0; j < n; j++ )
    {
        System.out.println(b[j]);
    }
    input.close();
    }
    
    
}

/*output:
3
8
1
6
-------------a[n]-------------
8
1
6
-------------b[n]-------------
8
1
6
 */