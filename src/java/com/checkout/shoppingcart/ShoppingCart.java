package com.checkout.shoppingcart;


import java.util.List;

public class ShoppingCart {
    private List<String> fruits;
    ShoppingCart(List<String> fruits) {
        this.fruits=fruits;
    }

    public int getTotalBill() {
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
