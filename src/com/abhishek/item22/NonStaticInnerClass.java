package com.abhishek.item22;

/**
 * Created by AbhishekPatel on 9/23/2017.
 */
public class NonStaticInnerClass {

    private static int staticOuterInt = 10;
    private int instanceOuterInt;

    NonStaticInnerClass(int instanceOuterInt) {
        this.instanceOuterInt = instanceOuterInt;
    }

    public void instanceMethod() {
        System.out.println("instanceMethod");
    }

    public class NonStaticClass {
        //private static int staticInnerInt = 100;
        private int instanceInnerInt;

        NonStaticClass(int instanceInnerInt) {
            this.instanceInnerInt = instanceInnerInt;
        }

        public void go() {
            System.out.println("instanceInnerInt :" + instanceInnerInt);

            System.out.println("staticInt :" + staticOuterInt);
            System.out.println("instanceOuterInt :" + instanceOuterInt);

            instanceMethod();
        }
    }
}
