class Demonstration_108 {
public static int j;
public static void main (String args[ ] ) {
for (int i = 0; i < 4; i++ ) {
try {

switch (i) {
case 0 :
int zero = 0;
j = 999/ zero; // Divide by zero
break;
case 1:
int b[ ] = null;
j = b[0] ; // Null pointer error
break;
case 2:
int c[] = new int [2] ;
j = c[10]; // Array index is out-of-bound

break;
case 3:
char ch = "Java".charAt(9) ;// String index is out-of-bound

break;

}
} catch (Exception e) {
System.out.println("In Test case#"+i+ "\n");

System.out.println (e.getMessage() );

}

}
}
}

/*
In Test case#0

/ by zero
In Test case#1

null
In Test case#2

10
In Test case#3

String index out of range: 9

*/