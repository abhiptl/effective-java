package com.abhishek.item21;

import java.util.Comparator;

/**
 * Created by AbhishekPatel on 9/23/2017.
 */
public class Host {
    private static class StrLengthComparator implements Comparator<String> {

        @Override
        public int compare(String s1, String s2) {
            return s1.length() - s2.length();
        }
    }

    public static final StrLengthComparator STR_LENGTH_COMPARATOR = new StrLengthComparator();
}
