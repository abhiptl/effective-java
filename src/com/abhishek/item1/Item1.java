package com.abhishek.item1;

/**
 * Created by AbhishekPatel on 9/8/2017.
 *
 * Item 1: Consider static factory methods instead of constructors

 * */
public class Item1 {

    public Item1() {}

    private static Item1 CAR = new Item1();

    private static Item1 BOOK = new Item1();

    public static Item1 createCarItem() {
        return CAR;

    }

}

interface Car {

}
