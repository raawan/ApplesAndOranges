package com.checkout.shoppingcart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartTest {



    @Test
    public void GIVEN_1Apple_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assert shoppingCart.getTotalBill(createShoppingBasketItems("Apple")) == 60;
    }

    @Test
    public void GIVEN_1orange_THEN_totalcost25p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assert shoppingCart.getTotalBill(createShoppingBasketItems("Orange")) == 25;
    }

    @Test
    public void GIVEN_1orangeAnd1Apple_THEN_totalcost85p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assert shoppingCart.getTotalBill(createShoppingBasketItems("Apple","Orange")) == 85;
    }

    private List<String> createShoppingBasketItems(String... items) {
        return Arrays.asList(items);
    }
}
