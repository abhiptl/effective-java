package com.abhishek._05_enums_annotations.item32;

import java.util.EnumSet;

/**
 * Created by AbhishekPatel on 9/29/2017.
 *
 * Item32: Use EnumSet instead of bit fields
 */
public class App32 {
    public static void main(String[] args) {
        Text text = new Text();
        text.applyStyles(EnumSet.of(Text.Style.BOLD, Text.Style.UNDERLINE));
    }
}
