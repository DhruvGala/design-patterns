package dev.dhruv.facade.car;

public class Radiator {
    private boolean isOn;

    public boolean isOn() {
        return isOn;
    }

    public void setOn() {
        isOn = true;
    }

    public void setOff() {
        isOn = false;
    }
}
