package _11_8;

import java.util.ArrayList;
import java.util.Date;

public class Account {

    public String name;
    public int id;
    public int balance;
    public ArrayList<Transaction> transactions = new ArrayList<Transaction>();

    public Account(String name, int id, int balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    public void deposit(int amount, String description) {
        this.balance += amount;
        this.transactions.add(new Transaction(amount, this.balance, description, 'D'));
    }

    public void withdraw(int amount, String description) {
        if (this.balance < amount) {
            throw new IllegalArgumentException("You don't have enough saldo");
        }
        this.balance -= amount;
        this.transactions.add(new Transaction(amount, this.balance, description, 'W'));
    }



}
