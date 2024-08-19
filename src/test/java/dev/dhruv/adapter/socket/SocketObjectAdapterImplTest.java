package dev.dhruv.adapter.socket;

import org.junit.jupiter.api.Test;

public class SocketObjectAdapterImplTest {

    @Test
    public void testSocketObjectAdapterImpl() {
        ISocketAdapter socketAdapter = new SocketObjectAdapterImpl();

        assert socketAdapter.get120Volt().getVolts() == 120;
        assert socketAdapter.get12Volt().getVolts() == 12;
        assert socketAdapter.get3Volt().getVolts() == 3;
    }
}
