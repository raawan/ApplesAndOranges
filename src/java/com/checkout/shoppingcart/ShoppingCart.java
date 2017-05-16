package com.checkout.shoppingcart;


public class ShoppingCart {
    public int getTotalBill(String fruit) {
        if(fruit.equalsIgnoreCase("Apple")) {
            return 60;
        } else {
            return 25;
        }
    }
}
