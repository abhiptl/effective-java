package com.abhishek.item1;

/**
 * Created by AbhishekPatel on 9/10/2017.
 */
public class App1 {

    public static void main(String[] args) {
        Item1 car1 = Item1.createCarItem();
        System.out.println("Car 1 :"+ car1);

        Item1 car2 = Item1.createCarItem();
        System.out.println("Car 2:"+ car2);

        System.out.println("(Car1==Car2) :" + (car1 == car2));
    }
}
