// 2. Write a BankAccount class with the following properties: 
// accountNumber, balance,
// and owner. 
// Implement methods to 
// deposit, withdraw, and check the account balance.

import java.util.Scanner;

/*

*/
class j5 {
    private long accountNumber;
    private long balance;
    private String owner;

    // constructor 
    public j5(long acc, long bal, String owner)
    {
        this.accountNumber = acc;
        this.balance = bal;
        this.owner = owner;
    }
    private void getdata()
    {
        System.out.println(this.owner);
        System.out.println(this.accountNumber);
        System.out.println(this.balance);
    }
    private long check_bal()
    {
        return this.balance;
    }
    private void withdraw(long x)
    {
        if(balance == 0)
        {
            System.out.println("you don't have balance in your account");
        }
        else if(x > balance)
        {
            System.out.println("you don't have sufficient balance");
        }
        else
        {
             this.balance =this.balance - x;
        }
    }

    private void deposit(long x)
    {
        this.balance =this.balance + x;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        j5 p1 = new j5(12345,8000,"jinal");
        p1.getdata();
        int ch;
        long money;
        do{
            System.out.println("\n1. withdraw\n2. deposit \n3. check balance\nEnter your choice : ");
            ch = input.nextInt();
            switch(ch)
            {
                case 1: 
                    System.out.println("\nhow much money you want to withdraw : ");
                    money = input.nextLong();  
                    p1.withdraw(money);
                    break;
                
                case 2: 
                System.out.println("\nhow much money you want to deposit : ");
                    money = input.nextLong();  
                    p1.deposit(money);
                    break;
                
                    case 3: 
                // System.out.println("\nhow much money you want to deposit : ");
                //     money = input.nextLong();  
                    p1.check_bal();
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("enter valid choice");
            }

        }while(ch != 0);
    }
    
}