/* Run the following program with exception handling mechanism for the same input
*/

// Case : try with multiple catch block��

public class Demonstration_107 {
public static void main (String args[ ]) {
try {
int i = args.length; // No of arguments in the comm


String myString[] = new String[i];
// If i = 0 then myString null pointer error
if(myString[0].equals("Java")){ // #1 //
System.out.println("First word is Java !");



}
System.out.println( " Number of arguments = " + i );
int x = 12/ i; // # 2 //
int y[ ] = {555, 999}; // y is an array of size 2 with index 0,1

y[ i ] = x; //#3// Index is out-of-range may occur if i> 1

}
catch (ArithmeticException e ) { // To catch the error at #2

System.out.println ( " Div by 0 : "+ e );
}
catch (NullPointerException e ) { // To catch the error at #1

System.out.println ( "A null pointer exception :" + e );
}
catch (ArrayIndexOutOfBoundsException e ) {
// To catch the error at #3
System.out.println ("Array Index OOB : " + e);
}
}
}

/*

E:\khushi>java Demonstration_107
Array Index OOB : java.lang.ArrayIndexOutOfBoundsException: 0

E:\khushi>java Demonstration_107 java
A null pointer exception :java.lang.NullPointerException

E:\khushi>java Demonstration_107 Java
A null pointer exception :java.lang.NullPointerException

E:\khushi>java Demonstration_107 I Love Java
A null pointer exception :java.lang.NullPointerException

E:\khushi>java Demonstration_107 10 20 30 40
A null pointer exception :java.lang.NullPointerException

*/