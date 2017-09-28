package com.abhishek.item27;

import java.util.Iterator;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/28/2017.
 */
public class RecursiveTypeParameter<T> {

    public static <T extends Comparable<T>> T max(List<T> list) {
        Iterator<T> i = list.iterator();
        T result = i.next();
        while (i.hasNext()) {
            T t = i.next();
            // t instance will have access to compareTo if T does not extends MyComparable<T>.
            if (t.compareTo(result) > 0)
                result = t;
        }
        return result;
    }
}



