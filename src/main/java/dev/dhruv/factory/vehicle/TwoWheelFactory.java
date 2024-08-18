package dev.dhruv.factory.vehicle;

/**
 * Concrete factory class for TwoWheeler.
 */
public class TwoWheelFactory implements IVehicleFactory {

    @Override
    public AVehicle createVehicle() {
        return new TwoWheelerVehicle();
    }
}
