package dev.dhruv.factory.abs.car;

import java.util.UUID;

/**
 * Concrete Product for Sedan Car
 */
public class Sedan implements ICar {
    private String tin;

    @Override
    public void assemble() {
        tin = UUID.randomUUID().toString();
    }

    @Override
    public String getTin() {
        return tin;
    }
}
