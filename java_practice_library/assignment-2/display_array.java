
import java.util.Scanner;
public class display_array {
    public static void main(String[] args) {
        int a[] = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Enter :");
        for (int i = 0; i < 5; i++) {
            a[i] = input.nextInt();
        }

        for (int i : a) {
            System.out.println(i+" -> ");
        }

        input.close();
    }
}
