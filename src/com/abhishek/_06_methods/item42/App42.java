package com.abhishek._06_methods.item42;

import java.util.Arrays;

/**
 * Item42: Use varargs judiciously
 */
public class App42 {
    private int a;
    public static void main(String[] args) {
        int[] digits = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 4 };
        System.out.println(sum(digits));
    }

    // Simple use of varargs
    static int sum(int... args) {
        int sum = 0;
        for (int arg : args)
            sum += arg;
        return sum;
    }
}
