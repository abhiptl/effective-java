package com.abhishek._05_enums_annotations.item33;

import java.util.*;

/**
 * Created by AbhishekPatel on 9/29/2017.
 *
 * Item33: Use EnumMap instead of ordinal indexing
 */
public class App33 {
    public static void main(String[] args) {

        List<Herb> garden = new ArrayList<>();
        garden.add(new Herb("ANNUAL1", Herb.Type.ANNUAL));
        garden.add(new Herb("BIENNIAL1", Herb.Type.BIENNIAL));
        garden.add(new Herb("BIENNIAL2", Herb.Type.BIENNIAL));

        // Need to pass class object of key to constructor
        Map<Herb.Type, Set<Herb>> herbsByType =
                new EnumMap<Herb.Type, Set<Herb>>(Herb.Type.class);


        for (Herb.Type t : Herb.Type.values())
            herbsByType.put(t, new HashSet<Herb>());
        for (Herb h : garden)
            herbsByType.get(h.getType()).add(h);
        System.out.println(herbsByType);



    }
}
