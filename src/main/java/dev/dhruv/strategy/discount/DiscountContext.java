package dev.dhruv.strategy.discount;

public class DiscountContext {
    private Discounter discounter;

    public DiscountContext(Discounter discounter) {
        this.discounter = discounter;
    }

    /**
     * can assign different discounts at run-time.
     */
    public void setDiscounter(Discounter discounter) {
        this.discounter = discounter;
    }

    public Double applyDiscount(Double amount) {
        return discounter.applyDiscount(amount);
    }
}
