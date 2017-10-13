package com.abhishek._07_general_programming.item45;

/**
 * Item 45: Minimize the scope of local variables
 */
public class App45 {
    public static void main(String[] args) {
        for (int i = 0, n = 5; i < n; i++) {
            System.out.println(" i : "+ i);
        }

        //System.out.printf(" i : "+ i);
    }


}
