public class RandomSum {
    public static void main(String[] args) {
        int sum = 0;

        while (sum <= 20) {
            double randomNumber = Math.random() * 10; 
            sum += randomNumber;

            System.out.println("Generated: " + randomNumber + ", Running Sum: " + sum);
        }

        System.out.println("Final Sum: " + sum + " (exceeded 20, terminating program)");
    }
}

/*
 Generated: 7.624922987545814, Running Sum: 7
Generated: 5.854058178003293, Running Sum: 12
Generated: 9.769480939122271, Running Sum: 21
Final Sum: 21 (exceeded 20, terminating program)
 */