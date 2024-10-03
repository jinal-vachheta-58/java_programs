/*

cube of the given integer number.

 */

import java.util.Scanner;

class cube {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        int ans_cube = cube.find_cube(num);
        System.out.println(ans_cube);
        input.close();
    }

    /* Write and run a Java program to calculate factorial */
    public static int find_cube(int num) {

        return num * num * num;
    }
}

/*
 * output:
 * 5
 * 125
 */
