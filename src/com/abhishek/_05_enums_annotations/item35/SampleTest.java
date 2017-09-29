package com.abhishek._05_enums_annotations.item35;

/**
 * Created by AbhishekPatel on 9/29/2017.
 */
public class SampleTest {
    @MyTest
    public static void m1() {
    } // Test should pass

    public static void m2() {
    }

    @MyTest
    public static void m3() { // Test Should fail
        throw new RuntimeException("Boom");
    }

    public static void m4() {
    }

    @MyTest
    public void m5() {
    } // INVALID USE: nonstatic method

    public static void m6() {
    }

    @MyTest
    public static void m7() { // Test should fail
        throw new RuntimeException("Crash");
    }

    public static void m8() {
    }
}
