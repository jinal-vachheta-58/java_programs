class DivideZero {
static int anyFunction ( int x, int y ) {
int a = x/y;
return (a);
}
public static void main (String args [ ] ) {
int result = anyFunction (25, 0) ; // Exception occurs here as y = 0

System.out.println ( " Result : " + result );

}
}

/*
 Exception in thread "main" java.lang.ArithmeticException: / by zero
        at DivideZero.anyFunction(DivideZero.java:3)
        at DivideZero.main(DivideZero.java:7)
 */