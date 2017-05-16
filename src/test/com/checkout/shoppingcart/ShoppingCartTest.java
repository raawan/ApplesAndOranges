package com.checkout.shoppingcart;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCartTest {


    @Test
    public void GIVEN_1Apple_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        List<String> shoppingBasket = new ArrayList<>();
        shoppingBasket.add("Apple");
        assert shoppingCart.getTotalBill(shoppingBasket) == 60;
    }

    @Test
    public void GIVEN_1orange_THEN_totalcost25p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        List<String> shoppingBasket = new ArrayList<>();
        shoppingBasket.add("Orange");
        assert shoppingCart.getTotalBill(shoppingBasket) == 25;
    }

    @Test
    public void GIVEN_1orangeAnd1Apple_THEN_totalcost85p() {
        ShoppingCart shoppingCart = new ShoppingCart();
        List<String> shoppingBasket = new ArrayList<>();
        shoppingBasket.add("Apple");
        shoppingBasket.add("Orange");
        assert shoppingCart.getTotalBill(shoppingBasket) == 85;
    }
}
