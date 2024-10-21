/*3) Write an application that generates the first 15 numbers in the Fibonacci series and first 15
prime numbers. */

public class FibonacciAndPrimes {
    public static void main(String[] args) {

        System.out.println("First 15 Fibonacci numbers:");
        int a = 0, b = 1; 
        System.out.print(a + " " + b + " "); 

        for (int i = 2; i < 15; i++) {
            int next = a + b; 
            System.out.print(next + " ");
            a = b; 
            b = next; 
        }

        System.out.println("\n");

        System.out.println("First 15 prime numbers:");
        int count = 0; 
        int number = 2; 

        while (count < 15) {
            if (isPrime(number)) {
                System.out.print(number + " ");
                count++; 
            }
            number++; 
        }
    }

    public static boolean isPrime(int n) {
        if (n <= 1) 
            return false; 

        for (int i = 2; i <= n/2; i++) {
            if (n % i == 0) 
                return false; 
        }
        return true;
    }
}

/*
 First 15 Fibonacci numbers:
0 1 1 2 3 5 8 13 21 34 55 89 144 233 377 

First 15 prime numbers:
2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 
 */
