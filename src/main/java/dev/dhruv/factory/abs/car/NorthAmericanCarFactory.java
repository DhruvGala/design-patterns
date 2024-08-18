package dev.dhruv.factory.abs.car;

/**
 * Concrete Factory for North America Cars.
 */
public class NorthAmericanCarFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new Sedan();
    }

    @Override
    public ICarSpecification createSpecification() {
        return new NorthAmericanSpecification();
    }
}
