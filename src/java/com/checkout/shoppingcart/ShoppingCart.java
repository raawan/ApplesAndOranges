package com.checkout.shoppingcart;


import java.math.BigDecimal;
import java.util.List;

public class ShoppingCart {

    private static final int ORANGES_TO_DISCOUNT = 3;
    private static final int APPLES_TO_DISCOUNT = 2;
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

        return totalBills.add(getApplesCost(countApple)).add(getOrangesCost(countOranges));
    }

    private BigDecimal getOrangesCost(int countOranges) {
        int orangesToDiscount = countOranges / ORANGES_TO_DISCOUNT;
        int totalOrangesToCharge = (orangesToDiscount*2) + (countOranges%ORANGES_TO_DISCOUNT);
        return new BigDecimal(Integer.valueOf(totalOrangesToCharge)).multiply(Fruit.ORANGE.cost);
    }

    private BigDecimal getApplesCost(int countApple) {
        int appletodiscount = countApple / APPLES_TO_DISCOUNT;
        int totalApplestoCharge = appletodiscount + (countApple%APPLES_TO_DISCOUNT);
        return new BigDecimal(Integer.valueOf(totalApplestoCharge)).multiply(Fruit.APPLE.cost);
    }

}
