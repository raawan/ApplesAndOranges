package com.checkout.shoppingcart;


import java.util.List;

public class ShoppingCart {
    public int getTotalBill(List<String> fruits) {

        int totalBills  = 0;
        for(String fruit : fruits) {
            if(fruit.equalsIgnoreCase("Apple")) {
                totalBills += 60;
            } else {
                totalBills += 25;
            }
        }
        return totalBills;
    }
}
