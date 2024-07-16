// 3. Implement a program that converts 
// temperature from Celsius to Fahrenheit and vice versa.


import java.util.Scanner;
class j3{
    public double Fahrenheit_to_Celsius(Double fahrenheit)
    {
        return ((fahrenheit-32)*5)/9;
    }
    public double Celsius_to_Fahrenheit(Double celsius)
    {
        return (celsius*1.8)+32;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double ans;
        int ch;
        double a,b;
        
        
        // int a = Integer.parseInt(args[0]) ;
        // int b = Integer.parseInt(args[1]) ;
        j3 obj = new j3();
        do{
            System.out.println("\n1. Fahrenheit_to_Celsius\n2. Celsius_to_Fahrenheit\nEnter your choice : ");
            ch = input.nextInt();
            switch(ch)
            {
                case 1: 
                    System.out.println("\nenter Fahrenheit : ");
                    a = input.nextFloat();  
                    ans = obj.Fahrenheit_to_Celsius(a);
                    System.out.println("Fahrenheit_to_Celsius : "+ ans);
                    break;
                
                case 2: 
                    System.out.println("\nenter Celsius : ");
                    b = input.nextFloat();
                    ans = obj.Celsius_to_Fahrenheit(b);
                    System.out.println("Celsius_to_Fahrenheit : "+ ans);
                    break;
                
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("enter valid choice");
            }

        }while(ch != 0);
    }

}

/*
 output :
 C:\Users\mcs358\Desktop\JAVA>javac j3.java

C:\Users\mcs358\Desktop\JAVA>java j3

1. Fahrenheit_to_Celsius
2. Celsius_to_Fahrenheit
Enter your choice :
1

enter Fahrenheit :
46
Fahrenheit_to_Celsius : 7.777777777777778

1. Fahrenheit_to_Celsius
2. Celsius_to_Fahrenheit
Enter your choice :
2

enter Celsius :
12
Celsius_to_Fahrenheit : 53.6

1. Fahrenheit_to_Celsius
2. Celsius_to_Fahrenheit
Enter your choice :
897
enter valid choice

1. Fahrenheit_to_Celsius
2. Celsius_to_Fahrenheit
Enter your choice :
0
Exit
 */