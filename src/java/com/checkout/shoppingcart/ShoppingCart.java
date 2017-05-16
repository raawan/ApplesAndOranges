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
        int countApple =0;
        int countOranges = 0;
        for(Fruit fruit : fruits) {
            if(fruit.equals(Fruit.APPLE)) countApple++;
            if(fruit.equals(Fruit.ORANGE)) countOranges++;
        }
        int appletodiscount = countApple / 2;
        int totalApplestoCharge = appletodiscount + (countApple%2);
        BigDecimal totalAppleCharges = new BigDecimal(Integer.valueOf(totalApplestoCharge)).multiply(Fruit.APPLE.cost);
        totalBills = totalBills.add(totalAppleCharges);

        int orangesToDiscount = countOranges / 3;
        int totalOrangesToCharge = (orangesToDiscount*2) + (countOranges%3);
        BigDecimal totalOrangesCharges = new BigDecimal(Integer.valueOf(totalOrangesToCharge)).multiply(Fruit.ORANGE.cost);
        totalBills = totalBills.add(totalOrangesCharges);

        return totalBills;
    }
}
