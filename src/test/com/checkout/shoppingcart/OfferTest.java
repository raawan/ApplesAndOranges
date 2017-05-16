package com.checkout.shoppingcart;


import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.checkout.shoppingcart.ShoppingCart.Fruit.APPLE;
import static com.checkout.shoppingcart.ShoppingCart.Fruit.ORANGE;

public class OfferTest {

    @Test
    public void GIVEN_2apples_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems(APPLE,APPLE));
        BigDecimal totalbill = shoppingCart.getTotalBill();
        assert totalbill.equals(new BigDecimal("00.60"));
    }

    @Test
    public void GIVEN_3oranges_THEN_totalcost50p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems(ORANGE,ORANGE,ORANGE));
        BigDecimal totalbill = shoppingCart.getTotalBill();
        assert totalbill.equals(new BigDecimal("00.50"));
    }

    @Test
    public void GIVEN_4oranges_THEN_totalcost75p() {
        ShoppingCart shoppingCart = new ShoppingCart(
                createShoppingBasketItems(ORANGE,ORANGE,ORANGE,ORANGE));
        BigDecimal totalbill = shoppingCart.getTotalBill();
        assert totalbill.equals(new BigDecimal("00.75"));
    }

    private List<ShoppingCart.Fruit> createShoppingBasketItems(ShoppingCart.Fruit... items) {
        return Arrays.asList(items);
    }
}
