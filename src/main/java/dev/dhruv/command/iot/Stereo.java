package dev.dhruv.command.iot;

public class Stereo implements IDevice {
    private boolean isOn = false;
    private int volume = 0;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public void adjustVolume() {
        volume = 50;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getVolume() {
        return volume;
    }
}
