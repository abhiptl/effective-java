package com.abhishek.item21;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/22/2017.
 *
 * Item21: Use function objects to represent strategies
 */
public class App21 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Concrete Strategy");
        list.add("Function Object");
        list.add("Strategy as Anonymous class");
        list.add("Strategy Interface");


        System.out.println("Before Sort :"+ list);

        Collections.sort(list, Host.STR_LENGTH_COMPARATOR);

        System.out.println("After Sort :"+ list);
    }
}
