package com.abhishek._07_general_programming.item53;

import java.util.Arrays;
import java.util.Set;

/**
 *
 * Item 53: Prefer interfaces to reflection
 *
 * Run this program by passing following command line arguments
 *
 * java.util.HashSet 1 2 4 7 4 3 2 3 2 2
 */
public class App53 {
    public static void main(String[] args) {
        Class<?> aClass = null;

        try {
            aClass = Class.forName(args[0]);
        }catch (Exception e) {
            System.err.println("Class not found");
            System.exit(1);
        }

        Set<String> s = null;

        try {
            s = (Set<String>)aClass.newInstance();
        } catch (Exception e) {
            System.err.println("Class instantiation error");
            System.exit(1);
        }

        s.addAll(Arrays.asList(args).subList(1, args.length));
        System.out.println(s);

    }
}
