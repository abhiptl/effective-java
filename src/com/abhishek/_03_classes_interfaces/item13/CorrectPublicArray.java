package com.abhishek._03_classes_interfaces.item13;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/18/2017.
 */
public class CorrectPublicArray {
    private static final Integer[] VALUES = {1,2 };
    public static final List<Integer> UNMODIFIED_VALUES = Collections.unmodifiableList(Arrays.asList(VALUES));

    public static final Integer[] values() {
        return VALUES.clone();
    }

}

class Thing{}
