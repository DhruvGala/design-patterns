package dev.dhruv.facade.car;

import static dev.dhruv.facade.car.Constants.DEFAULT_COOLING_TEMPERATURE;
import static dev.dhruv.facade.car.Constants.MAX_TEMPERATURE;

public class CarEngineFacade {
    private final FuelInjector fuelInjector = new FuelInjector();
    private final CoolingController coolingController = new CoolingController();
    private final AirFlowController airFlowController = new AirFlowController();

    public FuelInjector getFuelInjector() {
        return fuelInjector;
    }

    public CoolingController getCoolingController() {
        return coolingController;
    }

    public AirFlowController getAirFlowController() {
        return airFlowController;
    }

    public void startEngine() {
        fuelInjector.turnOn();
        airFlowController.takeAir();
        fuelInjector.inject();
        coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMPERATURE);
        coolingController.run();
    }

    public void stopEngine() {
        fuelInjector.turnOff();
        coolingController.cool(MAX_TEMPERATURE);
        coolingController.stop();
        airFlowController.turnOff();
    }
}
