package RealTime.Bank;

import java.util.Date;

public class Transaction {
    private Date date;
    private double amount;
    private String type;

    public Transaction(double amount, String type) {
        this.date = new Date();
        this.amount = amount;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public double getAmount() {
        return amount;
    }

    public String getType() {
        return type;
    }
}
