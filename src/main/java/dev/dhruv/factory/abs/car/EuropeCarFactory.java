package dev.dhruv.factory.abs.car;

/**
 * Concrete Factory for Europe Cars.
 */
public class EuropeCarFactory implements ICarFactory {
    @Override
    public ICar createCar() {
        return new HatchBack();
    }

    @Override
    public ICarSpecification createSpecification() {
        return new EuropeSpecification();
    }
}
