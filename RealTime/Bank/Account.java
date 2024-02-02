package RealTime.Bank;

public class Account {
    private String holder;
    private double balance;
    public Logs logs;

    public Account(String holder, double balance) {
        this.holder = holder;
        this.balance = balance;
        this.logs = new Logs();
    }

    public String getHolder() {
        return this.holder;
    }

    public double getBalance() {
        return this.balance;
    }
    
    public void deposit(double amount) {
        this.balance += balance;

        this.logs.insert(amount, "Deposit");

        System.out.println("The amount Rs." + amount + " has been deposited in your account. Current Balance is " + this.balance);

        return;
    }

    public String withdrawal(double amount) {
        if(amount > this.balance) {
            this.logs.insert(amount, "Failed Withdrawal");
            return "Insufficient funds";
        }

        this.balance -= amount;

        this.logs.insert(amount, "Withdrawal");

        return "The amount Rs." + amount + " has been withdrawn from your account. Remaining Balance is " + this.balance;
    }
}
