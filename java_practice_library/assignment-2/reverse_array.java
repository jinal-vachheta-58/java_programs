// Reverse of an array.

public class reverse_array {
    public static void main(String[] args) {
        int a[] = {5,4,3,2,1};

        int start = 0;
        int end = a.length - 1;

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println("___________________________");

        while (start <= end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

// output:
// 5
// 4
// 3
// 2
// 1
// ___________________________
// 1
// 2
// 3
// 4
// 5