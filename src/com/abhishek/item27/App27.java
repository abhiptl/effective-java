package com.abhishek.item27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Abhishek Patel on 9/24/2017.
 *
 * Item 27: Favor generic methods
 */
public class App27 {
    public static void main(String[] args) {
        Set s1 = new HashSet();
        s1.add("S1");
        Set s2 = new HashSet();
        s2.add("S2");
        System.out.println("Raw union : "+GenericMethods.rawUnion(s1, s2));

        Set<String> s11 = new HashSet();
        s11.add("S11");
        Set<String> s22 = new HashSet();
        s22.add("S22");
        System.out.println("Generic union : "+GenericMethods.genericUnion(s11, s22));

        List<String> list = Arrays.asList("Abhi", "Patel");

        System.out.println("Max :"+RecursiveTypeParameter.max(list));
    }
}


