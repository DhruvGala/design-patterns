package dev.dhruv.facade.car;

public class FuelInjector {
    private boolean isOn;

    public FuelPump getFuelPump() {
        return fuelPump;
    }

    FuelPump fuelPump = new FuelPump();

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public void inject() {
        fuelPump.pump();
    }

    public boolean isOn() {
        return isOn;
    }
}
