public class Demonstration_106 {
public static void main (String args[ ])
{

int i = args.length; // No of arguments in the comm



String myString[] = new String[i];
myString[0]=args[0];



if(myString[0].equals("Java"))

{

System.out.println("First word is Java !");

}
System.out.println( " Number of arguments = " + i );
int x = 12/ i;
int y[ ] = {555, 999};
y[ i ] = x;

}
}

/*
 E:\new>java Demonstration_106
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 0
        at Demonstration_106.main(Demonstration_106.java:10)

E:\new>java Demonstration_106 12 34 java
 Number of arguments = 3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Demonstration_106.main(Demonstration_106.java:24)

E:\new>java Demonstration_106 I Love Java
 Number of arguments = 3
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 3
        at Demonstration_106.main(Demonstration_106.java:24)

E:\new>java Demonstration_106 12 34
 Number of arguments = 2
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 2
        at Demonstration_106.main(Demonstration_106.java:24)

E:\new>java Demonstration_106 12
 Number of arguments = 1

E:\new>java Demonstration_106 10 20 30 40
 Number of arguments = 4
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 4
        at Demonstration_106.main(Demonstration_106.java:24)

E:\new>

 */