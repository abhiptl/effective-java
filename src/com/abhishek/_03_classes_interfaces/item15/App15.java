package com.abhishek._03_classes_interfaces.item15;

/**
 * Created by AbhishekPatel on 9/19/2017.
 *
 * Item15: Minimize mutability
 */
public class App15 {

    public static void main(String[] args) {
        Complex complex = Complex.valueOf(12,12);
        System.out.println("Complex :"+ complex);
    }
}
