package com.abhishek._06_methods.item43;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * Item 43: Return empty arrays or collections, not nulls
 */
public class App43 {
    private final List<Cheese> cheesesInStock = new ArrayList<>();
    private static final Cheese[] EMPTY_CHEESE_ARRAY = new Cheese[0];

    public static void main(String[] args) {
        App43 app43 = new App43();
        System.out.printf("Size of cheesesInStock : "+ app43.getCheeses().length);
    }


    /**
     * @return an array containing all of the cheeses in the shop.
     */
    public Cheese[] getCheeses() {
        Cheese cheese1 = new Cheese();
        Cheese cheese2 = new Cheese();

        cheesesInStock.add(cheese1);
        cheesesInStock.add(cheese2);
        return cheesesInStock.toArray(EMPTY_CHEESE_ARRAY);
    }

    // The right way to return a copy of a collection
    public List<Cheese> getCheeseList() {
        if (cheesesInStock.isEmpty())
            return Collections.emptyList(); // Always returns same list
        else
            return new ArrayList<Cheese>(cheesesInStock);
    }
}

class Cheese {}