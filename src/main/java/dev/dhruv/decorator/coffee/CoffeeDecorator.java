package dev.dhruv.decorator.coffee;

public abstract class CoffeeDecorator implements ICoffee {
    protected ICoffee decoratedCoffee;

    public CoffeeDecorator(ICoffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription();
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost();
    }
}
