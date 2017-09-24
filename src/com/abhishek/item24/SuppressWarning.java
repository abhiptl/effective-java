package com.abhishek.item24;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/24/2017.
 */
public class SuppressWarning {

    void unsuppressedWarning() {
        List<String> list = new ArrayList();
    }

    // Suppress warning from entire method
    @SuppressWarnings("unchecked")
    void suppressedWarning() {
        List<String> list = new ArrayList();

    }

    void suppressedNarrowScope() {
        // Suppress warning for local variable only
        @SuppressWarnings("unchecked") List<String> list = new ArrayList();
    }

}
