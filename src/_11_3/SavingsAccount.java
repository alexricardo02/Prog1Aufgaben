package _11_3;

public class SavingsAccount extends Account {

    public SavingsAccount(String accountNumber, Double balance, Double annualInterestRate) {
        super(accountNumber, balance, annualInterestRate);
    }

    @Override
    public String toString() {
        return "SaveAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                '}';
    }
}
