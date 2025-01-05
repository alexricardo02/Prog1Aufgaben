package _11_3;

public class CheckingAccount extends Account{

    public double overdraftLimit;

    public CheckingAccount(String accountNumber, Double balance, Double annualInterestRate, double overdraftLimit) {
        super(accountNumber, balance, annualInterestRate);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > overdraftLimit || super.balance - amount < 0) {
            throw new IllegalArgumentException("The amount exceeds the overdraft limit or you dont have enough saldo");
        } else {
            super.balance -= amount;
        }
    }



    @Override
    public String toString() {
        return "CheckAccount{" +
                "overdraftLimit=" + overdraftLimit +
                ", accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
