package dev.dhruv.decorator.coffee;

public class SugarDecorator extends CoffeeDecorator {
    public SugarDecorator(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Sugar";
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost() + 0.2;
    }
}
