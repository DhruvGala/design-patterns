package dev.dhruv.decorator.coffee;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(ICoffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public String getDescription() {
        return decoratedCoffee.getDescription() + ", Milk";
    }

    @Override
    public Double getCost() {
        return decoratedCoffee.getCost() + 0.5;
    }
}
