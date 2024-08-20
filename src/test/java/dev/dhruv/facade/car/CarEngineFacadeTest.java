package dev.dhruv.facade.car;

import org.junit.jupiter.api.Test;

public class CarEngineFacadeTest {

    @Test
    public void testCarTurnsOn() {
        CarEngineFacade carEngine = new CarEngineFacade();

        carEngine.startEngine();

        assert carEngine.getFuelInjector().isOn();
        assert carEngine.getFuelInjector().getFuelPump().isPumping();
        assert carEngine.getAirFlowController().getAirFlowMeter().getReading() != 0;
        assert carEngine.getCoolingController().getRadiator().isOn();
        assert carEngine.getCoolingController().getTemperatureSensor().getReading() != 0;
    }

    @Test
    public void testCarTurnsOf() {
        CarEngineFacade carEngine = new CarEngineFacade();
        carEngine.startEngine();

        carEngine.stopEngine();

        assert !carEngine.getFuelInjector().isOn();
        assert carEngine.getCoolingController().getTemperatureSensor().getReading() == 50;
        assert !carEngine.getCoolingController().getRadiator().isOn();
        assert carEngine.getAirFlowController().getAirFlowMeter().getReading() == 0;
    }

}
