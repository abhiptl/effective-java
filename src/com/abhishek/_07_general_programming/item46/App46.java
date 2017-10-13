package com.abhishek._07_general_programming.item46;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * Item 46: Prefer for-each loops to traditional for loops
 */
public class App46 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Print all integers :" + list);

        /*for(Integer i : list) {
            if(i % 2 == 0) {
                list.remove(i);
            }
        }
        System.out.printf("Print all Odd integers :" + list);*/

        for (Iterator<Integer> iter = list.listIterator(); iter.hasNext(); ) {
            Integer value = iter.next();
            if (value % 2 == 0) {
                iter.remove();
            }
        }

        System.out.println("Print all Odd integers :" + list);


    }
}
