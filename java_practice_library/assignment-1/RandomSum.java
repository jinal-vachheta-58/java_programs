/*
7) Use While loop to generate random numbers and maintain a running sum of these values.
Terminate when the sum exceeds 20. (Note: use Math. random() method to obtain numbers.)
*/

class RandomSum {
    public static void main(String[] args) {
        double sum = 0;
        int count = 0;

        // While loop to generate random numbers and keep a running sum
        while (sum <= 20) {
            // Generate a random number between 0 and 1
            double randomNum = Math.random();

            // Add the random number to the running sum
            sum += randomNum;
            count++;

            // Print the generated random number and the current sum
            System.out.println("Random Number " + count + ": " + randomNum);
            System.out.println("Running Sum: " + sum);
        }

        // Output the final result
        System.out.println("Sum exceeded 20 after " + count + " iterations.");
    }
}
