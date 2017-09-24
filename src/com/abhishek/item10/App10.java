package com.abhishek.item10;

import com.abhishek.item9.*;

/**
 * Created by AbhishekPatel on 9/17/2017.
 *
 * Item 10: Always override toString
 */
public class App10 {
    public static void main(String[] args) {
        com.abhishek.item10.PhoneNumber p1 = new com.abhishek.item10.PhoneNumber(707, 867, 5309);
        System.out.println("PhoneNumber.toString() :" + p1);
    }
}
