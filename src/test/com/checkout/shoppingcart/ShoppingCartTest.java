package com.checkout.shoppingcart;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class ShoppingCartTest {



    @Test
    public void GIVEN_1Apple_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems("Apple"));
        assert shoppingCart.getTotalBill() == 60;
    }

    @Test
    public void GIVEN_1orange_THEN_totalcost25p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems("Orange"));
        assert shoppingCart.getTotalBill() == 25;
    }

    @Test
    public void GIVEN_1orangeAnd1Apple_THEN_totalcost85p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems("Apple","Orange"));
        assert shoppingCart.getTotalBill() == 85;
    }

    private List<String> createShoppingBasketItems(String... items) {
        return Arrays.asList(items);
    }
}
