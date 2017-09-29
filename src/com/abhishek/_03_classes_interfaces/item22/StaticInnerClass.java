package com.abhishek._03_classes_interfaces.item22;

/**
 * Created by AbhishekPatel on 9/23/2017.
 */
public class StaticInnerClass {

    private static int staticOuterInt = 10;
    private int instanceOuterInt;

    public static class StaticClass {
        private static int staticInnerInt = 100;
        private int instanceInnerInt = 120;

        public void go() {
            System.out.println("staticInnerInt :" + staticInnerInt);
            System.out.println("instanceInnerInt :" + instanceInnerInt);

            System.out.println("staticInt :" + staticOuterInt);
        }
    }
}
