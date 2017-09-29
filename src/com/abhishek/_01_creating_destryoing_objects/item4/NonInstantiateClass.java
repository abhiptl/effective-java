package com.abhishek._01_creating_destryoing_objects.item4;

/**
 * Created by AbhishekPatel on 9/11/2017.
 *
 * Item 4 - Enforce noninstantiability with a private contructor
 *
 * These are utility class used for grouping static methods and static fields
 */
public class NonInstantiateClass {

    private NonInstantiateClass() {
        throw new AssertionError("Class can't be instantiate");
    }
}

/*
Prevent class from sub classing

class B extends NonInstantiateClass {

    public B() {
        super();
    }
}*/
