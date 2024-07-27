// 2. Write a program that calculates the area 
// and perimeter of a rectangle, 
// given the length and
// width as input.

import java.util.Scanner;
class j2{
    public float calculate_area(float a,float b)
    {
        return a*b;
    }
    public float calculate_perimeter(float a,float b)
    {
        return (a*b)*2;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        float ans;
        int ch;
        float a,b;
        System.out.println("\nenter a: ");
        a = input.nextFloat();
        System.out.println("\nenter b : ");
        b = input.nextFloat();

        j2 obj = new j2();
        do{
            System.out.println("\n1. perimeter\n2. area\nEnter your choice : ");
            ch = input.nextInt();
            switch(ch)
            {
                case 1: 
                    ans = obj.calculate_perimeter(a,b);
                    System.out.println("perimeter : "+ ans);
                    break;
                
                case 2: 
                    ans = obj.calculate_area(a,b);
                    System.out.println("area : "+ ans);
                    break;
                
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("enter valid choice");
            }

        }while(ch != 0);
        input.close();
    }

}

// output : 
/*
 
 C:\Users\mcs358\Desktop\JAVA>javac j2.java

C:\Users\mcs358\Desktop\JAVA>java j2

enter a:
5

enter b :
6

1. perimeter
2. area
Enter your choice :
1
perimeter : 60.0

1. perimeter
2. area
Enter your choice :
2
area : 30.0

1. perimeter
2. area
Enter your choice :
0
Exit
 */