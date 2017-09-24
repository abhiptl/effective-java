package com.abhishek.item22;

/**
 * Created by AbhishekPatel on 9/23/2017.
 *
 * Item23: Favor static member classes over nonstatic
 */
public class App22 {
    public static void main(String[] args) {
        StaticInnerClass.StaticClass staticClass = new StaticInnerClass.StaticClass();
        staticClass.go();


        NonStaticInnerClass nonStaticInnerClass = new NonStaticInnerClass(12);
        nonStaticInnerClass.instanceMethod();

        NonStaticInnerClass.NonStaticClass nonStaticClass = nonStaticInnerClass.new NonStaticClass(13);
        nonStaticClass.go();
    }
}
