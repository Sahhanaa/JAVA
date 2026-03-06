package junit.demo;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankAccountTest {

    @Test
    public void testDeposit() {
        BankAccount acc = new BankAccount(1000);
        acc.deposit(500);
        assertEquals(1500, acc.getBalance(), 0.01);
    }

    @Test
    public void testWithdraw() {
        BankAccount acc = new BankAccount(1000);
        acc.withdraw(300);
        assertEquals(700, acc.getBalance(), 0.01);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testWithdrawException() {
        BankAccount acc = new BankAccount(1000);
        acc.withdraw(2000);
    }
}