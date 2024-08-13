package dev.dhruv.strategy.discount;

import org.junit.jupiter.api.Test;

public class EasterDiscounterTest {

    private Discounter easterDiscounter = new EasterDiscounter();


    @Test
    void testEasterDiscountApplied() {
        Double discountedValue = easterDiscounter.applyDiscount(100.0);
        assert discountedValue == 50;
    }
}
