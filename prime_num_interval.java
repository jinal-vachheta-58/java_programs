import java.util.Scanner;

class prime_num_interval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // int num = input.nextInt();
        int num ;
        int flag = 0;
        int x = input.nextInt();
        int y = input.nextInt();

        for(int j = x; j < y; j++) {
            num = j;
            if( num == 1)
            {
                System.out.println("1 is not prime number ");
            }
            else if (num > 1) {
                for (int i = 2; i < num; i++) {
                    if( (num % i) == 0 )
                    {
                        // System.out.println("not prime number");
                        flag = 1;
                        break;
                    }
                }
                if (flag == 1) {
                    // System.out.println("not prime number");
                    flag = 0;
                }
                else {
                    System.out.print(num+" , ");
                } 
            }

        }
        input.close();
    }
}
