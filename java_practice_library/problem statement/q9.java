//Q: Write java program to calculate the Sum of the square of first 10 integers.
public class q9 {

    public static void main(String[] args) {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i * i; 
        }

        System.out.println("The sum of the squares of the first 10 integers is: " + sum);
    }
}

/*
 The sum of the squares of the first 10 integers is: 385
 */
