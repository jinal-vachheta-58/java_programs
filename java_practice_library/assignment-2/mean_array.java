// mean of array
import java.util.Scanner;

public class mean_array {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements :");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }
        
        double total_elements = a.length;
        double total_of_array = 0;

        for (int i = 0; i < a.length; i++) {
            total_of_array = total_of_array + a[i];
        }
        System.out.println("mean = " + total_of_array/total_elements);
        input.close();
    }
}