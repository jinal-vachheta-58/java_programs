// 1. Declare variables of different data types (int, double, boolean, char) and perform various
// arithmetic operations on them.


import java.util.Scanner;
class j1{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
    public int mul(int a,int b)
    {
        return a*b;
    }
    public boolean bool(int a,int b)
    {
        return a==b;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int ans;
        int ch,a,b;
        System.out.println("enter a :");
        a = input.nextInt();
        System.out.println("enter b :");
        b = input.nextInt();
        // int a = Integer.parseInt(args[0]) ;
        // int b = Integer.parseInt(args[1]) ;
        j1 obj = new j1();
        do{
            System.out.println("\n1. add\n2. sub \n3. div \n4. mul\n5. compare a & b bool \n\nEnter your choice : ");
            ch = input.nextInt();
            switch(ch)
            {
                case 1: 
                    ans = obj.add(a,b);
                    System.out.println("add : "+ ans);
                    break;
                
                case 2: 
                    ans = obj.sub(a,b);
                    System.out.println("sub : "+ ans);
                    break;
                
                case 3: 
                    ans = obj.div(a,b);
                    System.out.println("div : "+ ans);
                    break;
                
                case 4: 
                    ans = obj.mul(a,b);
                    System.out.println("mul : "+ ans);
                    break;
                case 5: 
                    boolean x = obj.bool(a,b);
                    System.out.println("a == b = "+ x);
                    break;
                case 0:
                    System.out.println("Exit");
                default:
                    System.out.println("enter valid choice");
            }

        }while(ch != 0);
    }

}

// output : 
/*
C:\Users\mcs358\Desktop\JAVA>java j1
enter a :
6
enter b :
2

1. add
2. sub
3. div
4. mul
5. compare a & b bool

Enter your choice :
1
add : 8

1. add
2. sub
3. div
4. mul
5. compare a & b bool

Enter your choice :
2
sub : 4

1. add
2. sub
3. div
4. mul
5. compare a & b bool

Enter your choice :
3
div : 3

1. add
2. sub
3. div
4. mul
5. compare a & b bool

Enter your choice :
4
mul : 12

1. add
2. sub
3. div
4. mul
5. compare a & b bool

Enter your choice :
5
a == b = false

1. add
2. sub
3. div
4. mul
5. compare a & b bool

Enter your choice :
897
enter valid choice

1. add
2. sub
3. div
4. mul
5. compare a & b bool

Enter your choice :
0
Exit
enter valid choice

*/