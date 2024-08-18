package dev.dhruv.factory.vehicle;

/**
 * Concrete factory class for FourWheeler
 */
public class FourWheelFactory implements IVehicleFactory {

    @Override
    public AVehicle createVehicle() {
        return new FourWheelerVehicle();
    }
}
