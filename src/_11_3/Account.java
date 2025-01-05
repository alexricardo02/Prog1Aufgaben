package _11_3;

import java.util.Date;

public class Account {
    public String accountNumber;
    public Double balance;
    public Double annualInterestRate;
    public Date dateCreated;

    public Account(String accountNumber, Double balance, Double annualInterestRate) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
        this.dateCreated = new Date();
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if(this.balance - amount < 0){
            throw new IllegalArgumentException("You don't have enough saldo");
        } else {
            this.balance -= amount;
        }
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "The account " + this.accountNumber + "has a total of " + this.balance;
    }
}
