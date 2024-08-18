package dev.dhruv.factory.abs.car;

public class NorthAmericanSpecification implements ICarSpecification {
    private String driver;

    @Override
    public void display() {
        driver = "Left-Hand drive";
    }

    @Override
    public String getDrive() {
        return driver;
    }
}
