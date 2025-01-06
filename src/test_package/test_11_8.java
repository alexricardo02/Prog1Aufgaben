package test_package;

import _11_8.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

public class test_11_8 {

    @Test
    public void testAccountCreation() {
        Account account = new Account("George", 1122, 1000);
        assertEquals("George", account.getName());
        assertEquals(1122, account.getId());
        assertEquals(1000, account.getBalance());
        assertTrue(account.getTransactions().isEmpty());
    }

    @Test
    public void testDeposit() {
        Account account = new Account("George", 1122, 1000);
        account.deposit(30, "Deposit $30");
        account.deposit(40, "Deposit $40");
        account.deposit(50, "Deposit $50");

        assertEquals(1120, account.getBalance()); // Balance inicial: 1000 + 30 + 40 + 50
        assertEquals(3, account.getTransactions().size());

        Transaction lastTransaction = account.getTransactions().get(2);
        assertEquals('D', lastTransaction.getType());
        assertEquals(50, lastTransaction.getAmount());
        assertEquals(1120, lastTransaction.getBalance());
        assertEquals("Deposit $50", lastTransaction.getDescription());
    }

    @Test
    public void testWithdraw() {
        Account account = new Account("George", 1122, 1000);
        account.withdraw(5, "Withdraw $5");
        account.withdraw(4, "Withdraw $4");
        account.withdraw(2, "Withdraw $2");

        assertEquals(989, account.getBalance()); // Balance inicial: 1000 - 5 - 4 - 2
        assertEquals(3, account.getTransactions().size());

        Transaction lastTransaction = account.getTransactions().get(2);
        assertEquals('W', lastTransaction.getType());
        assertEquals(2, lastTransaction.getAmount());
        assertEquals(989, lastTransaction.getBalance());
        assertEquals("Withdraw $2", lastTransaction.getDescription());
    }

    @Test
    public void testTransactionHistory() {
        Account account = new Account("George", 1122, 1000);
        account.deposit(30, "Deposit $30");
        account.withdraw(20, "Withdraw $20");

        ArrayList<Transaction> transactions = account.getTransactions();
        assertEquals(2, transactions.size());

        Transaction depositTransaction = transactions.get(0);
        assertEquals('D', depositTransaction.getType());
        assertEquals(30, depositTransaction.getAmount());
        assertEquals(1030, depositTransaction.getBalance());
        assertEquals("Deposit $30", depositTransaction.getDescription());

        Transaction withdrawTransaction = transactions.get(1);
        assertEquals('W', withdrawTransaction.getType());
        assertEquals(20, withdrawTransaction.getAmount());
        assertEquals(1010, withdrawTransaction.getBalance());
        assertEquals("Withdraw $20", withdrawTransaction.getDescription());
    }
}
