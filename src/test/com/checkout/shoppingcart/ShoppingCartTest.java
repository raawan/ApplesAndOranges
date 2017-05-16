package com.checkout.shoppingcart;

import org.junit.jupiter.api.Test;

public class ShoppingCartTest {


    @Test
    public void GIVEN_1Apple_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        assert shoppingCart.getTotalBill("Apple") == 60;
    }
}
