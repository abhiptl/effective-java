package com.abhishek._06_methods.item39;

import java.util.Date;

/**
 * Created by AbhishekPatel on 10/1/2017.
 *
 * Item 39: Make defensive copies when needed
 */
public class App39 {
    public static void main(String[] args) {
        // Attack the internals of a Period instance
        Date start = new Date();
        Date end = new Date();
        BrokenImmutablePeriod p = new BrokenImmutablePeriod(start, end);
        end.setYear(78); // Modifies internals of p!
        p.end().setYear(99); // Modifies internals of p!

        Date start1 = new Date();
        Date end1 = new Date();
        RepairedImmutablePeriod p1 = new RepairedImmutablePeriod(start1, end1);
        end.setYear(78); // Does not Modifies internals of p!

    }
}
