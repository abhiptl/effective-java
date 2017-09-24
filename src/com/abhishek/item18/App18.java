package com.abhishek.item18;

/**
 * Created by AbhishekPatel on 9/22/2017.
 *
 * Item18: Prefer interfaces to abstract classes
 */
public class App18 {
    public static void main(String[] args) {
        Driver driver = new BusDriver();
        driver.drive();
        driver.getExperience();
    }
}
