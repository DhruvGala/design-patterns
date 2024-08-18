package dev.dhruv.factory.vehicle;

import org.junit.jupiter.api.Test;

public class VehicleTest {

    @Test
    public void testNonFactoryVehicleClient() {
        Client pClient = new Client(1);  // object creation is tightly coupled to client
        Vehicle pVehicle = pClient.getVehicle();

        assert pVehicle.getVehicle().contains("Two Wheeler");

        Client qClient = new Client(2);
        Vehicle qVehicle = qClient.getVehicle();

        assert qVehicle.getVehicle().contains("Four Wheeler");

        pClient.cleanup();
        qClient.cleanup();
    }
}
