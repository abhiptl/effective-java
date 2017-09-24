package com.abhishek.item3;

/**
 * Created by AbhishekPatel on 9/11/2017.
 *
 * Item 3 : Enforce the singleton property with a private
            constructor or an enum type
 */
public class SingletonPublicStaticClass {

    public static final SingletonPublicStaticClass INSTANCE = new SingletonPublicStaticClass();
    private SingletonPublicStaticClass() {}

}


