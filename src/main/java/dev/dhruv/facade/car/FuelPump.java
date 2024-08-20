package dev.dhruv.facade.car;

public class FuelPump {
    private boolean isPumping;

    public void pump() {
        isPumping = true;
    }

    public boolean isPumping() {
        return isPumping;
    }
}
