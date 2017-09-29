package com.abhishek._05_enums_annotations.item34;

/**
 * Created by AbhishekPatel on 9/29/2017.
 */
public enum BasicOperation implements Operation{
    PLUS("+") {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS("-") {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES("*") {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE("/") {
        public double apply(double x, double y) { return x / y; }
    };

    private final String symbol;
    BasicOperation(String symbol) {
        this.symbol = symbol;
    }
    @Override public String toString() {
        return symbol;
    }

}

interface Operation {
    double apply(double x, double y);
}
