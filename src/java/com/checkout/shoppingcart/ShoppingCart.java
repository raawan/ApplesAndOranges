package com.checkout.shoppingcart;


import java.util.List;

public class ShoppingCart {
    public int getTotalBill(List<String> fruit) {
        if(fruit.get(0).equalsIgnoreCase("Apple")) {
            return 60;
        } else {
            return 25;
        }
    }
}
