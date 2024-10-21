/*9) Write a java program to calculate Simple Interest using Command Line Arguments. (Hint use
Wrapper classes) */

public class SimpleInterestCalculator {
    public static void main(String[] args) {
        if (args.length != 3) 
            return;

        double principal = Double.parseDouble(args[0]);
        double rate = Double.parseDouble(args[1]);
        double time = Double.parseDouble(args[2]);

        double simpleInterest = (principal * rate * time) / 100;
        System.out.printf("Simple Interest: %.2f%n", simpleInterest);
    }
}


/*
 E:\java>java SimpleInterestCalculator 10000 10 3
Simple Interest: 3000.00

 */
