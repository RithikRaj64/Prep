package RealTime.Bank;

import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        AccountsList allAccounts = new AccountsList();

        System.out.println("Welcome to the Banking System");
        System.out.println("-----------------------------");

        // System.out.println("If you are an employee type 1");
        // System.out.println("If you are a customer type 2");

        // int who = Integer.parseInt(s.nextLine());

        // if(who == 1) {
        //     int ch = -1;

        //     while(ch != 2) {            
        //         System.out.println("Welcome Employee what would you like to do?");
        //         System.out.println("1) Create Account");
        //         System.out.println("2) Exit");
        //         ch = Integer.parseInt(s.nextLine());

        //         if(ch == 1) {
        //             System.out.println("Enter the name of the Account holder");
        //             String holder = s.nextLine();
        //             System.out.println("Enter the initial balance");
        //             double balance = Double.parseDouble(s.nextLine());
        //             allAccounts.createAccount(holder, balance);
        //             System.out.println("Account for the customer " + holder + " with the balance of Rs." + balance + " has been created");
        //         }

        //         else {
        //             break;
        //         }
        //     }
            
        // }
        // else {

        System.out.println("Do you have an account with our bank?");
        System.out.println("1) Yes");
        System.out.println("2) No");

        int x = Integer.parseInt(s.nextLine());

        String holder;
        AccountNode account;

        if(x == 1) {
            System.out.println("Please enter your name");
            holder = s.nextLine();
        }
        
        else {
            System.out.println("Please enter your name");
            holder = s.nextLine();
            System.out.println("Please enter your initial balance");
            double bal = Double.parseDouble(s.nextLine());
            allAccounts.createAccount(holder, bal);
        }
        
        account = allAccounts.selectAccount(holder);

        int ch = -1;

        while(ch != 5) {
            System.out.println("Welcome Customer what would you like to do?");
            System.out.println("1) Deposit");
            System.out.println("2) Withdraw");
            System.out.println("3) Check Balance");
            System.out.println("4) Display Transactions");
            System.out.println("5) Exit");
            ch = Integer.parseInt(s.nextLine());

            switch (ch) {
                case 1:
                    System.out.println("Enter the amount you want to deposit");
                    double depAmount = Double.parseDouble(s.nextLine());
                    account.deposit(depAmount);
                    break;
                    
                    case 2:
                    System.out.println("Enter the amount you want to withdraw");
                    double withAmount = Double.parseDouble(s.nextLine());
                    System.out.println(account.withdrawal(withAmount));
                    break;

                case 3:
                    System.out.println("Your balance is Rs." + account.getBalance());
                    break;

                case 4:
                    account.logs.print();
                    break;

                case 5:
                    break;

                default:
                    System.out.println("Invalid choice!!");
                    break;
            }
        }
        // }

        System.out.println("--------------");
        System.out.println("Thank You!!!!!");

        s.close();
    }
}
