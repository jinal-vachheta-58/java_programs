
// median of array
import java.util.Scanner;

public class median_of_array {
    public static void main(String[] args) {
        int a[] = new int[6];
        // int b[] = new int[6];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter elements : ");

        for (int i = 0; i < 6; i++) {
            a[i] = input.nextInt();
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("a[ " + i + " ] : " + a[i]);
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            System.out.println("a[ " + i + " ] : " + a[i]);
        }

        double total_elements = a.length;
        double median;

        if (total_elements % 2 == 1) {
            // odd index
            median = a[a.length / 2];
        } else {
            // even index
            median = (a[(a.length /2 ) - 1] + a[(a.length /2 )] ) / 2.0;
            // median = (a[(a.length / 2) - 1] + a[a.length / 2]) / 2.0;
        }

        System.out.println("median = " + median);
        input.close();
    }
}