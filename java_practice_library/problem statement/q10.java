//Q: Write java program to calculate the Factorial of a 10 (iteratively and recursively).
public class q10 {

    public static long factIterative(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static long factRecursive(int n) {
        if (n == 0) {
            return 1; 
        } else {
            return n * factRecursive(n - 1); 
        }
    }

    public static void main(String[] args) {
        int number = 10;

        long Result1 = factIterative(number);
        System.out.println("Factorial of " + number + " (Iterative): " + Result1);

        long Result2 = factRecursive(number);
        System.out.println("Factorial of " + number + " (Recursive): " + Result2);
    }
}

/*
 Factorial of 10 (Iterative): 3628800
Factorial of 10 (Recursive): 3628800
 */
