package dev.dhruv.adapter.socket;

import org.junit.jupiter.api.Test;

public class SocketClassAdapterImplTest {

    @Test
    public void testSocketClassAdapterImpl() {
        ISocketAdapter socketAdapter = new SocketClassAdapterImpl();

        assert socketAdapter.get3Volt().getVolts() == 3;
        assert socketAdapter.get12Volt().getVolts() == 12;
        assert socketAdapter.get120Volt().getVolts() == 120;

    }
}
