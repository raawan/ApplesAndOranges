package com.checkout.shoppingcart;


import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {

    enum Fruit {
        APPLE(new BigDecimal("00.60")),ORANGE(new BigDecimal("00.25"));
        private BigDecimal cost;
        Fruit(BigDecimal cost) {
            this.cost=cost;
        }
    }
    private List<Fruit> fruits;
    ShoppingCart(List<Fruit> fruits) {
        this.fruits=fruits;
    }

    public BigDecimal getTotalBill() {
        BigDecimal totalBills  = new BigDecimal("0.00");
        for(Fruit fruit : fruits) {
            totalBills = totalBills.add(fruit.cost);
        }
        return totalBills;
    }
}
