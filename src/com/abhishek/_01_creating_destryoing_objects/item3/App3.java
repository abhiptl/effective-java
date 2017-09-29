package com.abhishek._01_creating_destryoing_objects.item3;


/**
 * Created by AbhishekPatel on 9/11/2017.
 */
public class App3 {

    public static void main(String[] args) throws Exception {
        SingletonEnumClass singletonEnumClass = SingletonEnumClass.INSTANCE; // best way
        SingletonPublicStaticClass singletonPublicStaticClass = SingletonPublicStaticClass.INSTANCE;
        SingletonStaticFactoryClass singletonStaticFactoryClass = SingletonStaticFactoryClass.getInstance();
    }


}
