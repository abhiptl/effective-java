package com.abhishek._05_enums_annotations.item34;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by AbhishekPatel on 9/29/2017.
 *
 * Item 34: Emulate extensible enums with interfaces
 */
public class App34 {
    public static void main(String[] args) {
        double x = 2;
        double y = 4;

        test(Arrays.asList(ExtendedOperation.values()), x, y);
    }

    private static <T extends Enum<T> & Operation> void test(
            Collection<? extends Operation> opSet, double x, double y) {
        for (Operation op : opSet)
            System.out.printf("%f %s %f = %f%n",
                    x, op, y, op.apply(x, y));
    }

}
