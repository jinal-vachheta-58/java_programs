
/*
 * Java Program to print the largest element in an array
 */
import java.util.Scanner;

class min_val_array {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter n : ");

        int n = input.nextInt();
        int arr[] = new int[n];

        for (int j = 0; j < n; j++) {
            arr[j] = input.nextInt();
        }
        System.out.println("here is your n : ");

        for (int i = 0; i < n; i++) {
            System.out.println("arr[" + i + " ] : " + arr[i]);
        }

        // find min 
        int min = 10000;
        for(int x = 0; x< n; x++)
        {
            if(arr[x] <= min)
            {
                min = arr[x];
            }
        }
        System.out.println("min : "+ min);
        // System.out.println("arr[" + min + " ] : " + arr[min]);
        input.close();
    }
}
