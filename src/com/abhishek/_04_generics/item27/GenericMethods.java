package com.abhishek._04_generics.item27;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by AbhishekPatel on 9/24/2017.
 */
public class GenericMethods {

    public static Set rawUnion(Set s1, Set s2) {
        Set set = new HashSet(s1);
        set.addAll(s2);
        return set;
    }

    // Generic Method
    public static <E> Set<E> genericUnion(Set<E> s1, Set<E> s2) {
        Set<E> set = new HashSet<E>(s1);
        set.addAll(s2);
        return set;
    }

}
