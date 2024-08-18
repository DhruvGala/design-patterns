package dev.dhruv.factory.vehicle;

public class VehicleClient {
    private AVehicle aVehicle;

    public VehicleClient(IVehicleFactory vehicleFactory) {
        aVehicle = vehicleFactory.createVehicle();
    }

    public AVehicle getVehicle() {
        return aVehicle;
    }
}
