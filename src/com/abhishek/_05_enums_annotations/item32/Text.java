package com.abhishek._05_enums_annotations.item32;

import java.util.Set;

/**
 * Created by AbhishekPatel on 9/29/2017.
 */
public class Text {
    public enum Style {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH}

    // Any Set could be passed in, but EnumSet is clearly best
    public void applyStyles(Set<Style> styles) { }
}
