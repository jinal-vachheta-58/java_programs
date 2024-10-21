/*Write a BankAccount class with the following properties: accountNumber, balance,
and owner. Implement methods to deposit, withdraw, and check the account balance.*/

import java.util.Scanner;

class BankAccount {
    private int accountNumber;
    private double balance;
    private String owner;

    public BankAccount(int accountNumber, double balance, String owner) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.owner = owner;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Deposit amount must be greater than zero.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawal of $" + amount + " successful.");
            } else {
                System.out.println("Insufficient funds.");
            }
        } else {
            System.out.println("Withdrawal amount must be greater than zero.");
        }
    }

    public double checkBalance() {
        return balance;
    }
}

public class bank {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        BankAccount account = new BankAccount(123456, 1000.0, "khushi shah");

        int choice;
        do {
            System.out.println("\n*** Bank Account Menu ***");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = sc.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = sc.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    double balance = account.checkBalance();
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Exiting.........");
                    break;
                default:
                    System.out.println("Invalid choice. ");
            }
        } while (choice != 4);

        sc.close();
    }
}


/*

Z:\java>javac bank.java

Z:\java>java bank

*** Bank Account Menu ***
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 3
Current balance: $1000.0

*** Bank Account Menu ***
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 1
Enter amount to deposit: 2000
Deposit of $2000.0 successful.

*** Bank Account Menu ***
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 3
Current balance: $3000.0

*** Bank Account Menu ***
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 2
Enter amount to withdraw: 1000
Withdrawal of $1000.0 successful.

*** Bank Account Menu ***
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 3
Current balance: $2000.0

*** Bank Account Menu ***
1. Deposit
2. Withdraw
3. Check Balance
4. Exit
Enter your choice: 4
Exiting.........
*/
