package com.abhishek.item28;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/28/2017.
 *
 * Item28:  Use bounded wildcards to increase API flexibility
 */
public class App28 {
    public static void main(String[] args) {
        MyStack<Number> numberMyStack = new MyStackImpl<>();
        numberMyStack.push(new Integer(12));

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(13.50);
        doubleList.add(15.50);


        // not possible to put Iterator<Double> into Iterator<Number>
        //numberMyStack.pushAll(doubleList);
        numberMyStack.pushAllNew(doubleList);

        Object pop = numberMyStack.pop();
        List<Object> popList = new ArrayList<>();


        //numberMyStack.popAll(popList);
        numberMyStack.popAllNew(popList);

        for(Object o : popList) {
            System.out.println("Stack Element : " + o);
        }


    }
}
