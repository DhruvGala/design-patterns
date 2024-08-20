package dev.dhruv.facade.car;

public class CoolingController {
    private final Radiator radiator = new Radiator();
    private final TemperatureSensor temperatureSensor = new TemperatureSensor();

    public void setTemperatureUpperLimit(int limit) {
        temperatureSensor.setReading(limit);
    }

    public Radiator getRadiator() {
        return radiator;
    }

    public TemperatureSensor getTemperatureSensor() {
        return temperatureSensor;
    }

    public void run() {
        radiator.setOn();
    }

    public void cool(int temp) {
        temperatureSensor.setReading(temp);
    }

    public void stop() {
        radiator.setOff();
    }
}
