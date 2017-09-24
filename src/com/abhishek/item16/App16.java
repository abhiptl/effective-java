package com.abhishek.item16;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by AbhishekPatel on 9/19/2017.
 *
 * Item16: Favor composition over inheritance
 */
public class App16 {
    public static void main(String[] args) {
        WrongInstrumentSet<String> s =
                new WrongInstrumentSet<String>();
        s.addAll(Arrays.asList("Snap", "Crackle", "Pop"));

        System.out.println("Count :"+ s.getAddCount());

        Set<String> set = new HashSet<>();
        set.add("Snap");
        set.add("Crackle");
        set.add("Pop");
        CorrectHashSet s1 = new CorrectHashSet(new HashSet<String>());
        s1.addAll(set);

        System.out.println("Count :"+ s1.getAddCount());

    }
}
