/* 
9) Write a java program to calculate Simple Interest using Command Line Arguments. (Hint use
Wrapper classes)
 */

public class count_interest {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("give three arguments: principal , rate of interest, time(in year)");
        }

        try {
            double p = Double.parseDouble(args[0]);
            double r = Double.parseDouble(args[1]);
            double n = Double.parseDouble(args[2]);

            double SimpleInterest = (p * r * n) / 100;
            System.out.println(SimpleInterest);
        } catch (Exception e) {
            System.out.println("Error -> " + e.getMessage());
        }
    }
}
