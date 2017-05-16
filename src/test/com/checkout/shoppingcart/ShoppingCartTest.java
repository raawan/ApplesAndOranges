package com.checkout.shoppingcart;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import static com.checkout.shoppingcart.ShoppingCart.Fruit.*;

public class ShoppingCartTest {

    @Test
    public void GIVEN_1Apple_THEN_totalcost60p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems(APPLE));
        BigDecimal totalbill = shoppingCart.getTotalBill();
        assert totalbill.equals(new BigDecimal("00.60"));
    }

    @Test
    public void GIVEN_1orange_THEN_totalcost25p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems(ORANGE));
        assert shoppingCart.getTotalBill().equals(new BigDecimal("00.25"));
    }

    @Test
    public void GIVEN_1orangeAnd1Apple_THEN_totalcost85p() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems(APPLE,ORANGE));
        assert shoppingCart.getTotalBill().equals(new BigDecimal("00.85"));
    }

    @Test
    public void GIVEN_1orangeAnd3Apples_THEN_totalcost2pound5pence() {
        ShoppingCart shoppingCart = new ShoppingCart(createShoppingBasketItems(APPLE,APPLE,APPLE,ORANGE));
        assert shoppingCart.getTotalBill().equals(new BigDecimal("2.05"));
    }

    private List<ShoppingCart.Fruit> createShoppingBasketItems(ShoppingCart.Fruit... items) {
        return Arrays.asList(items);
    }
}
