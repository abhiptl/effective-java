package com.abhishek._06_methods;

/**
 * Created by AbhishekPatel on 10/1/2017.
 */
public class NonPublicMethods {

    // Private helper function for a recursive sort

    /**
     * Unlike normal
     * validity checks, they have no effect and essentially no cost unless you enable
     * them, which you do by passing the -ea (or -enableassertions) flag to the java
     * interpreter.
     *
     * @param a
     * @param offset
     * @param length
     */
    public static void sort(long a[], int offset, int length) {
        assert a != null;
        assert offset >= 0 && offset <= a.length;
        assert length >= 0 && length <= a.length - offset;
    }
}
