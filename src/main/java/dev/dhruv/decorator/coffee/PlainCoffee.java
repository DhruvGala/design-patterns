package dev.dhruv.decorator.coffee;

public class PlainCoffee implements ICoffee {
    
    @Override
    public String getDescription() {
        return "Plain Coffee";
    }

    @Override
    public Double getCost() {
        return 2.0;
    }
}
