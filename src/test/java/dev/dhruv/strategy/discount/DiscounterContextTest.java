package dev.dhruv.strategy.discount;

import org.junit.jupiter.api.Test;

public class DiscounterContextTest {

    @Test
    public void test() {
        DiscountContext discountContext = new DiscountContext(new ChristmasDiscounter());

        Double afterChristmasDiscount = discountContext.applyDiscount(100.0);
        assert afterChristmasDiscount == 90;

        discountContext.setDiscounter(new EasterDiscounter());
        Double afterEasterDiscount = discountContext.applyDiscount(100.0);
        assert afterEasterDiscount == 50;
    }
}
