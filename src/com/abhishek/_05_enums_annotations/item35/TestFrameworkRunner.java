package com.abhishek._05_enums_annotations.item35;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by AbhishekPatel on 9/29/2017.
 */
public class TestFrameworkRunner {
    public static void main(String[] args) throws Exception {
        int tests = 0;
        int passed = 0;
        Class testClass = Class.forName("com.abhishek._05_enums_annotations.item35.SampleTest");
        for (Method m : testClass.getDeclaredMethods()) {
            if (m.isAnnotationPresent(MyTest.class)) {
                tests++;
                try {
                    m.invoke(null);
                    passed++;
                } catch (InvocationTargetException wrappedExc) {
                    Throwable exc = wrappedExc.getCause();
                    System.out.println(m + " failed: " + exc);
                } catch (Exception exc) {
                    System.out.println("INVALID @Test: " + m);
                }
            }
        }
        System.out.printf("Passed: %d, Failed: %d%n",
                passed, tests - passed);
    }
}
