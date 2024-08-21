package dev.dhruv.proxy.bank;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SecureBankAccountProxy implements IBankAccount {
    private final Logger logger = LoggerFactory.getLogger(SecureBankAccountProxy.class);

    private BankAccountImpl bankAccount;
    private final String password;

    public SecureBankAccountProxy(String password) {
        this.password = password;
        authenticate();
    }


    @Override
    public void deposit(double amount) {
        if (bankAccount != null) {
            bankAccount.deposit(amount);
        }
    }

    @Override
    public void withdraw(double amount) {
        if (bankAccount != null) {
            bankAccount.withdraw(amount);
        }
    }

    @Override
    public double getBalance() {
        return bankAccount != null ? bankAccount.getBalance() : -1;
    }

    private void authenticate() {
        if (password.equals("admin123")) {
            bankAccount = new BankAccountImpl();
            logger.info("Authentication Successful");
        } else {
            logger.error("Authentication Failed.");
        }
    }
}
