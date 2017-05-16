package com.checkout.shoppingcart;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {


    @Test
    public void GIVEN_1Apple_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assert shoppingCart.getTotalBill("Apple") == 60;
    }

    @Test
    public void GIVEN_1orange_THEN_totalcost25p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assert shoppingCart.getTotalBill("Orange") == 25;
    }
}
