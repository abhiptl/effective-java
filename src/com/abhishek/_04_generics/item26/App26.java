package com.abhishek._04_generics.item26;

/**
 * Created by Abhishek Patel on 9/24/2017.
 *
 * Item26: Favor generic types
 */
public class App26 {
    public static void main(String[] args) {
        ObjectBasedStack objectBasedStack = new ObjectBasedStack();
        objectBasedStack.push("Object Based Stack");
        System.out.println("Pop from Object Based:"+ objectBasedStack.pop());

        GenericBasedStack<String> genericBasedStack = new GenericBasedStack<>();
        genericBasedStack.push("Generic String");
        System.out.println("Pop from Generic Based:"+ genericBasedStack.pop());
    }
}
