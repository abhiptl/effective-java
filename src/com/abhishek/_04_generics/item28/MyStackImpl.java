package com.abhishek._04_generics.item28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by AbhishekPatel on 9/28/2017.
 */
public class MyStackImpl<T> implements MyStack<T> {
    List<T> list = new ArrayList<T>();

    @Override
    public void push(T e) {
        list.add(e);
    }

    @Override
    public T pop() {
        int index = list.size() -1;
        T t =  list.get(list.size() -1);
        list.remove(index);
        return t;
    }

    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void pushAll(Iterable<T> src) {
        for(T t : src) {
            list.add(t);
        }
    }

    @Override
    public void pushAllNew(Iterable<? extends T> src) {
        for(T t : src) {
            list.add(t);
        }
    }

    @Override
    public void popAll(Collection<T> destination) {
        while(!isEmpty()) {
            destination.add(pop());
        }
    }

    @Override
    public void popAllNew(Collection<? super T> destination) {
        while(!isEmpty()) {
            destination.add(pop());
        }
    }
}
