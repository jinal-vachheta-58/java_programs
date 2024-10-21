class Demonstration_102 {
public static void main (String args [ ]) {
int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = a/b;
System.out.println("Value of c =" + c);
}
}

/*
 E:\java>java Demonstration_102 15 5
Value of c =3

E:\java>java Demonstration_102 6
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 1
        at Demonstration_102.main(Demonstration_102.java:4)
 */