package _11_8;

import java.util.Date;

public class Transaction {

    public Date date;
    public char type;
    public double amount;
    public double balance;
    public String description;

    public Transaction(Date date, char type, double balance, String description) {
        this.date = date;
        this.type = type;
        this.balance = balance;
        this.description = description;
    }

    public Transaction(double amount, double balance, String description, char type) {
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        this.type = type;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public char getType() {
        return type;
    }

    public void setType(char type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
