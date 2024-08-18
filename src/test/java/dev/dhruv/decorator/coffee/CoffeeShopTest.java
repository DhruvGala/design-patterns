package dev.dhruv.decorator.coffee;

import org.junit.jupiter.api.Test;

public class CoffeeShopTest {

    @Test
    public void testCoffeeDecorators() {
        ICoffee coffee = new PlainCoffee(); //start with baseline

        assert coffee.getDescription().contains("Plain Coffee");
        assert coffee.getCost() == 2.0;

        ICoffee milkCoffee = new MilkDecorator(new PlainCoffee());
        assert milkCoffee.getDescription().contains("Plain Coffee");
        assert milkCoffee.getDescription().contains("Milk");
        assert milkCoffee.getCost() == 2.5;

        ICoffee sugarMilkCoffee = new SugarDecorator(new MilkDecorator(new PlainCoffee()));
        assert sugarMilkCoffee.getDescription().contains("Plain Coffee");
        assert sugarMilkCoffee.getDescription().contains("Milk");
        assert sugarMilkCoffee.getDescription().contains("Sugar");
        assert sugarMilkCoffee.getCost() == 2.7;
    }
}
