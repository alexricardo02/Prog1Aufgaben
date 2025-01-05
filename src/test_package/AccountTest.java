package test_package;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Date;

import _11_3.*;

public class AccountTest {

    @Test
    public void testAccountToString() {
        Account account = new Account("A12345", 1000.0, 5.0);
        assertEquals("Account [accountNumber=A12345, balance=1000.0, annualInterestRate=5.0, dateCreated=" + new Date() + "]", account.toString());
    }

    @Test
    public void testCheckingAccountToString() {
        CheckingAccount checkingAccount = new CheckingAccount("C12345", 1000.0, 3.5, 500.0);
        assertEquals("CheckingAccount [accountNumber=C12345, balance=1000.0, overdraftLimit=500.0]", checkingAccount.toString());
    }

    @Test
    public void testSavingsAccountToString() {
        SavingsAccount savingsAccount = new SavingsAccount("S12345", 1500.0, 4.0);
        assertEquals("SavingsAccount [accountNumber=S12345, balance=1500.0]", savingsAccount.toString());
    }

    @Test
    public void testDeposit() {
        Account account = new Account("A12345", 1000.0, 5.0);
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawFromAccount() {
        Account account = new Account("A12345", 1000.0, 5.0);
        account.withdraw(500.0);
        assertEquals(500.0, account.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawFromCheckingAccount() {
        CheckingAccount checkingAccount = new CheckingAccount("C12345", 1000.0, 3.5, 500.0);
        checkingAccount.withdraw(1200.0);  // Within overdraft limit
        assertEquals(-200.0, checkingAccount.getBalance(), 0.01);
    }

    @Test
    public void testWithdrawFromSavingsAccount() {
        SavingsAccount savingsAccount = new SavingsAccount("S12345", 1500.0, 4.0);
        savingsAccount.withdraw(1600.0);  // Insufficient funds
    }
}
