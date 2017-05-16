package com.checkout.shoppingcart;


import java.util.List;

public class ShoppingCart {

    enum Fruit {
        APPLE(60),ORANGE(25);
        private int cost;
        Fruit(int cost) {
            this.cost=cost;
        }
    }
    private List<Fruit> fruits;
    ShoppingCart(List<Fruit> fruits) {
        this.fruits=fruits;
    }

    public int getTotalBill() {
        int totalBills  = 0;
        for(Fruit fruit : fruits) {
            totalBills += fruit.cost;
        }
        return totalBills;
    }
}
