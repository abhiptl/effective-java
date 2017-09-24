package com.abhishek.item6;

import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * Created by AbhishekPatel on 9/13/2017.
 */
public class ObjectReference {
    public static void main(String[] args) {
        // Strong Reference
        Integer prime = 1;

        // Soft Reference
        Integer prime2 = 2;
        SoftReference<Integer> soft = new SoftReference<Integer>(prime2);
        prime2 = null;

        // Weak Reference
        Integer prime3 = 5;
        WeakReference<Integer> weak = new WeakReference<Integer>(prime3);
        prime3 = null;


    }
}
