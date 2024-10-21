//this is wrong

import java.util.Scanner;

class StringTrimDemo {
    public static void main(String[] args) {

        // Create a Scanner object for reading input

        Scanner scanner = new Scanner(System.in);
        String str;
        
        System.out.println("Enter 'stop' to quit.");
        System.out.println("Enter country: ");
        
        do {
            str = scanner.nextLine(); // Read the input line
            str = str.trim(); // Remove leading and trailing whitespace
            
            if (str.equalsIgnoreCase("India")) {
                System.out.println("Capital is New Delhi.");
            } else if (str.equalsIgnoreCase("America")) {
                System.out.println("Capital is New York.");
            } else if (str.equalsIgnoreCase("England")) {
                System.out.println("Capital is London.");
            } else if (str.equalsIgnoreCase("Singapore")) {
                System.out.println("Capital is Singapore!");
            }
            
        } while (!str.equalsIgnoreCase("stop"));
        
        // Close the scanner
        
        scanner.close();
    }
}

