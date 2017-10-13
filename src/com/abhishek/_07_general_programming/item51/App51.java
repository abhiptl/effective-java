package com.abhishek._07_general_programming.item51;

/**
 *
 * Item 51: Beware the performance of string concatenation
 */
public class App51 {
    public static final int LINE_WIDTH = 12;

    public static void main(String[] args) {

    }

    public String badStatement() {
        String result = "";
        for (int i = 0; i < numItems(); i++)
            result += lineForItem(i); // String concatenation
        return result;
    }

    public String goodStatement() {
        StringBuilder b = new StringBuilder(numItems() * LINE_WIDTH);
        for (int i = 0; i < numItems(); i++)
            b.append(lineForItem(i));
        return b.toString();
    }

    public int numItems() {
        return 100;
    }

    public String lineForItem(int i) {
        return "lineForItem"+i;
    }
}
