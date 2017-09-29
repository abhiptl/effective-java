package com.abhishek._05_enums_annotations.item33;

/**
 * Created by AbhishekPatel on 9/29/2017.
 */

public class Herb {
    public enum Type {ANNUAL, PERENNIAL, BIENNIAL}

    private final String name;
    private final Type type;

    Herb(String name, Type type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return name;
    }
}
