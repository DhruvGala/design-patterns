package dev.dhruv.proxy.bank;

public interface IBankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
}
