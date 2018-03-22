package com.abhishek._04_generics.item23;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Abhishek Patel on 9/23/2017.
 *
 * Item23: Don’t use raw types in new code
 *
 *
 */
public class App23 {
    public static void main(String[] args) {
        List rawlist = new ArrayList();
        rawlist.add("string");
        rawlist.add(new String[]{"1","2"});

        List<Object> genericobjectlist = new ArrayList<>();
        genericobjectlist.add("string");
        genericobjectlist.add(new String[]{"1","2"});
        genericobjectlist.add(new ArrayList<>());


        List<?> unbounded = new ArrayList<>();
        unbounded.add(null);




    }
}
