/*
first 15 prime numbers
 */

public class prime_numbers {
    public static void main(String[] args) {
        int total_prime_num = 0;
        int num;
        int flag = 0;
        num = 2;
        while (total_prime_num != 15) {

            flag = 1;
            for (int i = 2; i < num; i++) {
                if (num == 1) {
                    flag = 0;
                    // System.out.println(num +" inside 1");
                    break;
                } else if (num % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(num + " -> ");
                total_prime_num++;
            }
            num++;
        }
    }
}

/*
 * output:
 * 2 -> 3 -> 5 -> 7 -> 11 -> 13 -> 17 -> 19 -> 23 -> 29 -> 31 -> 37 -> 41 -> 43
 * ->
 * 47 ->
 */