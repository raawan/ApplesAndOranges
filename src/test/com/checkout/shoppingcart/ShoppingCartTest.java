package com.checkout.shoppingcart;

public class ShoppingCartTest {


    @Test
    public void GIVEN_1Apple_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCartTest();
        shoppingCart.getTotalBill() == 60;
    }
}
