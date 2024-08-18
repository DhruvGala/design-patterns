package dev.dhruv.command.iot;

public class TV implements IDevice {
    private boolean isOn = false;
    private int channel = 0;

    @Override
    public void turnOn() {
        isOn = true;
    }

    @Override
    public void turnOff() {
        isOn = false;
    }

    public void changeChannel() {
        channel++;
    }

    public boolean isOn() {
        return isOn;
    }

    public int getChannel() {
        return channel;
    }
}
