import java.util.Scanner;

public class add_element_at_specific_pos_array {
    public static void main(String[] args) {
        int a[] = new int[6]; // We create an array with 6 elements to accommodate the new one.
        Scanner input = new Scanner(System.in);

        // Taking input for 5 elements
        System.out.println("Enter 5 elements for the array: ");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }

        // Asking for the position and the new element to add
        System.out.println("Enter the position (0 to 5) where you want to insert a new element: ");
        int position = input.nextInt();
        
        if(position < 0 || position > 5) {
            System.out.println("Invalid position! Please enter a position between 0 and 5.");
            return;
        }

        System.out.println("Enter the new element to add: ");
        int newElement = input.nextInt();

        // Shift elements to the right from the specified position
        for (int i = 5; i > position; i--) {
            a[i] = a[i - 1]; // Shift elements to the right
        }

        // Insert the new element at the specified position
        a[position] = newElement;

        // Display the updated array
        System.out.println("Updated array after insertion: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        input.close();
    }
}
