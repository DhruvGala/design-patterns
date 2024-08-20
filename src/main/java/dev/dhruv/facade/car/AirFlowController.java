package dev.dhruv.facade.car;

public class AirFlowController {
    private final AirFlowMeter airFlowMeter = new AirFlowMeter();

    public AirFlowMeter getAirFlowMeter() {
        return airFlowMeter;
    }

    public void takeAir() {
        airFlowMeter.setReading(50);
    }

    public void turnOff() {
        airFlowMeter.setReading(0);
    }
}
