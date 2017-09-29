package com.abhishek.item30;

/**
 * Created by AbhishekPatel on 9/29/2017.
 *
 * Item30: Use enums instead of int constants
 */
public class App30 {
    public static void main(String[] args) {
        double earthWeight = 75;
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        for (Planet p : Planet.values())
            System.out.printf("Weight on %s is %f%n",
                    p, p.surfaceWeight(mass));


        double x = 100.0;
        double y = 50.0;
        for (Operation op : Operation.values())
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));


    }
}
