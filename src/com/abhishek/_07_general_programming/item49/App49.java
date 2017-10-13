package com.abhishek._07_general_programming.item49;

import java.util.*;

/**
 * Item 49: Prefer primitive types to boxed primitives
 */
public class App49 {

    // Broken comparator - can you spot the flaw?
    static Comparator<Integer> brokenComparator = new Comparator<Integer>() {
        public int compare(Integer first, Integer second) {
            return first < second ? -1 : (first == second ? 0 : 1); // first == second will do identity comparison instead of value comparison
        }
    };

    static Comparator<Integer> naturalOrder = new Comparator<Integer>() {
        public int compare(Integer first, Integer second) {
            int f = first; // Auto-unboxing
            int s = second; // Auto-unboxing
            return f < s ? -1 : (f == s ? 0 : 1); // No unboxing
        }
    };

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(new Integer(42));
        list.add(new Integer(42));
        list.add(new Integer(23));

        System.out.println("Before sorting : " + list);
        Collections.sort(list, brokenComparator);
        System.out.println("Before broken sorting : " + list);

        List<Integer> list1 = new ArrayList<>();
        list1.add(new Integer(42));
        list1.add(new Integer(42));
        list1.add(new Integer(23));

        System.out.println("Before sorting : " + list1);
        Collections.sort(list1, naturalOrder);
        System.out.println("Before correct sorting : " + list1);
    }
}
