package com.abhishek.item14;

/**
 * Created by AbhishekPatel on 9/18/2017.
 */
public class PublicClass {
    public int neverExposeThisField;
    public final static int CONSTANT_EXPOSURE = 12;

    public String dontExposeMutualString = "Mutable String";


    private class PrivateClass {
        public int x;
        public int y;

        public PrivateClass(int x, int y) {
            this.x = x;
            this.y = y;
        }


    }
}
