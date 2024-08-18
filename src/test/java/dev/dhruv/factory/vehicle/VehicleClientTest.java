package dev.dhruv.factory.vehicle;

import org.junit.jupiter.api.Test;

public class VehicleClientTest {

    @Test
    public void testFactoryVehicleClient() {
        IVehicleFactory twoWheelFactory = new TwoWheelFactory();
        VehicleClient pClient = new VehicleClient(twoWheelFactory);
        AVehicle pVehicle = pClient.getVehicle();

        assert pVehicle.printVehicle().contains("Two Wheeler");

        IVehicleFactory fourWheelFactory = new FourWheelFactory();
        VehicleClient qClient = new VehicleClient(fourWheelFactory);
        AVehicle qVehicle = qClient.getVehicle();

        assert qVehicle.printVehicle().contains("Four Wheeler");
    }
}
