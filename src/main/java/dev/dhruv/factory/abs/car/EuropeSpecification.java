package dev.dhruv.factory.abs.car;

public class EuropeSpecification implements ICarSpecification {
    private String drive;

    @Override
    public void display() {
        drive = "Right-Hand drive";
    }

    @Override
    public String getDrive() {
        return drive;
    }
}
