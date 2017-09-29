package com.abhishek._04_generics.item25;

import java.util.List;

/**
 * Created by AbhishekPatel on 9/24/2017.
 * `
 */
public class CoVariantArray {

    public static void main(String[] args) {
        CoVariantArray coVariantArray = new CoVariantArray();
        coVariantArray.coVariance();
    }

    void coVariance() {
        Object[] arrayObject = new Long[2];
        arrayObject[1] = "I am String and get into Long container, oops";
    }

    void inVariance() {
        // InCompitable types
        //List<Object> listObject = new ArrayList<Long>();
    }

    void legalUseOfUnboundedWidcardArray() {
        List<?>[] unBounded = new List[2];
    }
}

