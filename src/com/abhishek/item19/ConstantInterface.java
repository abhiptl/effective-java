package com.abhishek.item19;

/**
 * Created by AbhishekPatel on 9/22/2017.
 */

// Incorrect way
public interface ConstantInterface {
    Integer MAX_CONSTANT = 12;
}


// Correct way
class UtilityClass {
    private UtilityClass() {}
    public static Integer MAX_CONSTANT = 12;
}
