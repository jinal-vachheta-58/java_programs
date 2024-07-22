
/*
 * 2. Implement a program that uses a switch-case statement to determine the day
 * of the week
 * based on a numeric input (1 for Monday, 2 for Tuesday, etc.).
 */
import java.util.Scanner;

class j8 {
    public static void main(String[] args) {
        System.out.println("1.mon\n2.tue\n3.wed\n4.thu\n5.fri\n6.sat\n7.sun\n");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int ch = input.nextInt();
        switch (ch) {
            case 1:
                System.out.println("mon");
                break;
            case 2:
                System.out.println("tue");
                break;
            case 3:
                System.out.println("wed");
                break;
            case 4:
                System.out.println("thu");
                break;
            case 5:
                System.out.println("fri");
                break;
            case 6:
                System.out.println("sat");
                break;
            case 7:
                System.out.println("sun");
                break;
        }
    }
}