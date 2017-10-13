package com.abhishek._07_general_programming.item48;

import java.math.BigDecimal;

/**
 * Item 48: Avoid float and double if exact answers are required
 */
public class App48 {
    public static void main(String[] args) {
        wrongCalculation();
        correctCalculation();
    }

    public static void wrongCalculation() {
        double funds = 1.00;
        int itemsBought = 0;
        for (double price = .10; funds >= price; price += .10) {
            funds -= price;
            itemsBought++;
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Change: $" + funds);
    }

    public static void correctCalculation() {
        final BigDecimal TEN_CENTS = new BigDecimal( ".10");
        int itemsBought = 0;
        BigDecimal funds = new BigDecimal("1.00");
        for (BigDecimal price = TEN_CENTS;
             funds.compareTo(price) >= 0;
             price = price.add(TEN_CENTS)) {
            itemsBought++;
            funds = funds.subtract(price);
        }
        System.out.println(itemsBought + " items bought.");
        System.out.println("Money left over: $" + funds);
    }

}
