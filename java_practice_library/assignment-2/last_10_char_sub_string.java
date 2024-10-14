
import java.util.Scanner;

public class last_10_char_sub_string {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input string from the user
        System.out.println("Enter a string: ");
        String str = input.nextLine();

        // Ensure the string has at least 10 characters
        if (str.length() >= 10) {
            // Extract the substring of the last 10 characters
            String lastTen = str.substring(str.length() - 10);
            System.out.println("The last 10 characters are: " + lastTen);
        } else {
            System.out.println("The string is shorter than 10 characters: " + str);
        }

        input.close();
    }
}
// output:
// jinal vachheta hello 
// The last 10 characters are: heta hello