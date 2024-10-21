/*
 6) WAP in JAVA that calculates the VAT(value added tax)on an amount of sale. The program takes amount of
sales and VAT rate as input and outputs the total amount
inclusive of VAT.
 */
import java.util.Scanner;

public class VATCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the amount of sales: ");
        double salesAmount = scanner.nextDouble();
        
        System.out.print("Enter the VAT rate (as a percentage): ");
        double vatRate = scanner.nextDouble();
        
        double vatAmount = calculateVAT(salesAmount, vatRate);
        double totalAmount = salesAmount + vatAmount;
        
        System.out.printf("VAT Amount: %.2f%n", vatAmount);
        System.out.printf("Total Amount (inclusive of VAT): %.2f%n", totalAmount);
        
        scanner.close();
    }

    public static double calculateVAT(double amount, double rate) {
        return amount * (rate / 100);
    }
}

/*
 Enter the amount of sales: 500
Enter the VAT rate (as a percentage): 10    
VAT Amount: 50.00
Total Amount (inclusive of VAT): 550.00    
 */
