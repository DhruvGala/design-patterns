package dev.dhruv.factory.vehicle.abs.car;

import dev.dhruv.factory.abs.car.*;
import org.junit.jupiter.api.Test;

public class CarFactoryTest {

    @Test
    public void testCarProduction() {
        ICarFactory northAmericanCarFactory = new NorthAmericanCarFactory();
        ICar ford = northAmericanCarFactory.createCar();
        ICarSpecification northAmericanCarSpecs = new NorthAmericanSpecification();

        ford.assemble();
        northAmericanCarSpecs.display();

        assert !ford.getTin().isBlank();
        assert northAmericanCarSpecs.getDrive().contains("Left-Hand");

        ICarFactory europeanCarFactory = new EuropeCarFactory();
        ICar bmw = europeanCarFactory.createCar();
        ICarSpecification europeanCarSpec = new EuropeSpecification();

        bmw.assemble();
        europeanCarSpec.display();

        assert !bmw.getTin().isBlank();
        assert europeanCarSpec.getDrive().contains("Right-Hand");
    }
}
