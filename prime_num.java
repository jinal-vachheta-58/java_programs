import java.util.Scanner;

class prime_num {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
int flag = 0;
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
                System.out.println("not prime number");
            }
            else {
                System.out.println("yes prime number");
            } 
        }
        input.close();
    }
}
