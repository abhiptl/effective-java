package com.abhishek.item9;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by AbhishekPatel on 9/17/2017.
 *
 * Item 9: Always override hashCode when you override equals
 */
public class App9 {
    public static void main(String[] args) {
        PhoneNumber p1 = new PhoneNumber(707, 867, 5309);
        Map<PhoneNumber, String> m
                = new HashMap<PhoneNumber, String>();
        m.put(p1, "Jenny");

        PhoneNumber p2 = new PhoneNumber(707, 867, 5309);
        String name = m.get(p2);
        System.out.println("name == Jenny :" + "Jenny".equals(name));

    }
}
