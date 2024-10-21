import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            // Display menu options
            System.out.println("\n*** Menu Driven Arithmetic Operations ***");
            System.out.println("1. Perform Integer Arithmetic Operations");
            System.out.println("2. Perform Double Arithmetic Operations");
            System.out.println("3. Perform Char Arithmetic Operations");
            System.out.println("4. Exit");
            System.out.print("Enter your choice (1-4): ");
            
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performIntegerOperations(scanner);
                    break;

                case 2:
                    performDoubleOperations(scanner);
                    break;

                case 3:
                    performCharOperations(scanner);
                    break;

                case 4:
                    keepRunning = false;
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
            }
        }
        scanner.close();
    }

    // Method to perform integer arithmetic operations
    private static void performIntegerOperations(Scanner scanner) {
        System.out.print("Enter the first integer: ");
        int intVar1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int intVar2 = scanner.nextInt();

        System.out.println("\nInteger Arithmetic Operations:");
        System.out.println("Sum: " + (intVar1 + intVar2));
        System.out.println("Difference: " + (intVar1 - intVar2));
        System.out.println("Product: " + (intVar1 * intVar2));
        System.out.println("Quotient: " + (intVar1 / intVar2));
        System.out.println("Remainder: " + (intVar1 % intVar2));
    }

    // Method to perform double arithmetic operations
    private static void performDoubleOperations(Scanner scanner) {
        System.out.print("Enter the first double value: ");
        double doubleVar1 = scanner.nextDouble();
        System.out.print("Enter the second double value: ");
        double doubleVar2 = scanner.nextDouble();

        System.out.println("\nDouble Arithmetic Operations:");
        System.out.println("Sum: " + (doubleVar1 + doubleVar2));
        System.out.println("Difference: " + (doubleVar1 - doubleVar2));
        System.out.println("Product: " + (doubleVar1 * doubleVar2));
        System.out.println("Quotient: " + (doubleVar1 / doubleVar2));
    }

    // Method to perform char arithmetic operations
    private static void performCharOperations(Scanner scanner) {
        System.out.print("Enter the first character: ");
        char charVar1 = scanner.next().charAt(0);
        System.out.print("Enter the second character: ");
        char charVar2 = scanner.next().charAt(0);

        // Convert characters to their ASCII values
        int asciiChar1 = charVar1;
        int asciiChar2 = charVar2;

        // Perform arithmetic operations
        int charSum = asciiChar1 + asciiChar2;
        char charSumResult = (char) charSum;

        System.out.println("\nChar Arithmetic Operations:");
        System.out.println("Sum of ASCII values: " + charSum);
        System.out.println("Character from Sum: " + charSumResult);
    }
}
