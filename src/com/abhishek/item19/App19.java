package com.abhishek.item19;

/**
 * Created by AbhishekPatel on 9/22/2017.
 *
 * Item19: Use interfaces only to define types
 */
public class App19 implements ConstantInterface{
    public static void main(String[] args) {
        System.out.println(ConstantInterface.MAX_CONSTANT);
        System.out.println(MAX_CONSTANT);

        System.out.println(UtilityClass.MAX_CONSTANT);
    }
}

