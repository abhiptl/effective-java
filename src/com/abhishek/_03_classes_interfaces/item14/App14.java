package com.abhishek._03_classes_interfaces.item14;

/**
 * Created by AbhishekPatel on 9/18/2017.
 *
 * Item14 : In public classes, use accessor methods, not public fields
 */
public class App14 {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.dontExposeMutualString = "Exposed";
        publicClass.neverExposeThisField = 133;


    }
}
