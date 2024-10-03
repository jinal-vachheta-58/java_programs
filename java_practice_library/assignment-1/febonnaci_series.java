/*
3) Write an application that generates the first 15 numbers 
in the Fibonacci series 
 */
public class febonnaci_series {
    public static void main(String[] args) {
        febonnaci_series.print_fibonacci_series();
        // System.out.println("hii");
    }

    public static void print_fibonacci_series() {
        int a = 0;
        int b = 1;
        int c = 0;
        int x = 0;
        System.out.print(a + "  ->  ");
        System.out.print(b + "  ->  ");
        while (x != 13) {
            // System.out.println("inside");
            c = a + b;
            System.out.print(c + "  ->  ");
            a = b;
            b = c;
            x++;
        }
    }
}
