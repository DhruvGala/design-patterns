package dev.dhruv.proxy.bank;

import org.junit.jupiter.api.Test;

public class SecureBankAccountProxyTest {

    @Test
    public void testSecureProxyBankAccount() {
        SecureBankAccountProxy secureProxy = new SecureBankAccountProxy("admin123");

        assert secureProxy.getBalance() != -1;

        secureProxy.deposit(1000);
        assert secureProxy.getBalance() == 1000;

        secureProxy.withdraw(500);
        assert secureProxy.getBalance() == 500;
    }

    @Test
    public void testSecureProxyBankAccountAuthFailed() {
        SecureBankAccountProxy secureProxy = new SecureBankAccountProxy("poorPwd");

        assert secureProxy.getBalance() == -1;
    }
}
