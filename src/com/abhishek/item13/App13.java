package com.abhishek.item13;

/**
 * Created by AbhishekPatel on 9/18/2017.
 *
 * Item13: Minimize the accessibility of classes and members
 */
public class App13 {

    public static void main(String[] args) {
        // Wrong
        System.out.println("Array Values[0]: "+ WrongPublicArray.VALUES[0]);
        System.out.println("Array Values[1]: "+ WrongPublicArray.VALUES[1]);

        WrongPublicArray.VALUES[0] = 12;
        WrongPublicArray.VALUES[1] = 24;

        System.out.println("Array Values[0]: "+ WrongPublicArray.VALUES[0]);
        System.out.println("Array Values[1]: "+ WrongPublicArray.VALUES[1]);


        // Correct
        System.out.println("Correct Array :" + CorrectPublicArray.UNMODIFIED_VALUES.toString());
        CorrectPublicArray.UNMODIFIED_VALUES.add(0, 12);


    }


}
