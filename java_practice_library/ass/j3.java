
/* 1. Declare variables of different data types (int, double, boolean, char) and perform various
arithmetic operations on them. */



public class j3 {
    public static void main(String[] args) {
        // Declaring variables of different data types
        int a = 10;
        int b = 4;
        double x = 3.5;
        double y = 2.0;
        boolean isTrue = true;
        char ch1 = 'A';
        char ch2 = 'B';

        // Performing arithmetic operations
        int sumInt = a + b;
        int difInt = a - b;
        int productInt = a * b;
        double quotientDouble = x / y;
        double remDouble = x % y;
		String concatenation = "" + ch1 + ch2;
		boolean resultBoolean = isTrue && false;

        // Displaying results for integer arithmetic
        System.out.println("Integer arithmetic:");
        System.out.println("Sum: " + sumInt);
        System.out.println("Difference: " + difInt);
        System.out.println("Product: " + productInt);

        // Displaying results for double arithmetic
        System.out.println("\nDouble arithmetic:");
        System.out.println("Quotient: " + quotientDouble);
        System.out.println("Remainder: " + remDouble);

        // Performing boolean operation (AND)
        //boolean resultBoolean = isTrue && false;
        System.out.println("\nBoolean operation:");
        System.out.println("Result of AND operation: " + resultBoolean);

        // Performing char operation (concatenation)
        //String concatenation = "" + ch1 + ch2;
        System.out.println("\nChar operation:");
        System.out.println("Concatenation of chars: " + concatenation);
    }
}
