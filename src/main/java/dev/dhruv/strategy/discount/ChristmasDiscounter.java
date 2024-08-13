package dev.dhruv.strategy.discount;

/**
 * Let's apply a 10% discount for Christmas
 */
public class ChristmasDiscounter implements Discounter{

    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.9;
    }
}
