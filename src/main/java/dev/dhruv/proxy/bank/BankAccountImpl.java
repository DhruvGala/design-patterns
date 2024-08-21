package dev.dhruv.proxy.bank;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccountImpl implements IBankAccount {
    private final Logger logger = LoggerFactory.getLogger(BankAccountImpl.class);

    private double balance;

    @Override
    public void deposit(double amount) {
        balance += amount;
        logger.info(String.format("Deposited: $%s in Account. Updated Balance: $%s.", amount, balance));
    }

    @Override
    public void withdraw(double amount) {
        balance -= amount;
        logger.info(String.format("Withdrawn: $%s from Account. Updated Balance: $%s.", amount, balance));
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
