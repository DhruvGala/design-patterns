package dev.dhruv.strategy.discount;

/**
 * Let's apply discount of 50% for Easter
 */
public class EasterDiscounter implements Discounter{

    @Override
    public Double applyDiscount(Double amount) {
        return amount * 0.5;
    }
}
