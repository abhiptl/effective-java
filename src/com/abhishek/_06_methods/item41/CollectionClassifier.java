package com.abhishek._06_methods.item41;

import java.math.BigInteger;
import java.util.*;

/**
 * Created by AbhishekPatel on 10/2/2017.
 *
 * Broken! - What does this program print?
 */

public class CollectionClassifier {
    public static String classify(Set<?> s) {
        return "Set";
    }
    public static String classify(List<?> lst) {
        return "List";
    }

    /*public static String classify(Collection<?> c) {
        return "Unknown Collection";
    }*/

    public static String classify(Collection<?> c) {
        return c instanceof Set ? "Set" :
                c instanceof List ? "List" : "Unknown Collection";
    }

    public static void main(String[] args) {
        Collection<?>[] collections = {
                new HashSet<String>(),
                new ArrayList<BigInteger>(),
                new HashMap<String, String>().values()
        };
        for (Collection<?> c : collections)
            System.out.println(classify(c));
    }
}
