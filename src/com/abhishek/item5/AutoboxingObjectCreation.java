package com.abhishek.item5;

import java.util.Date;

/**
 * Created by AbhishekPatel on 9/12/2017.
 */
public class AutoboxingObjectCreation {


    public static void badProgram() {
        System.out.println("badProgram(Start) : "+new Date());
        Long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("badProgram(End) : "+new Date());
    }

    public static void goodProgram() {
        System.out.println("goodProgram(Start) : "+new Date());
        long sum = 0L;
        for (long i = 0; i < Integer.MAX_VALUE; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("goodProgram(End) : "+new Date());
    }
}
