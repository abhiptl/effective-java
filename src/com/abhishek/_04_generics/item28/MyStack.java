package com.abhishek._04_generics.item28;

import java.util.Collection;

/**
 * Created by AbhishekPatel on 9/28/2017.
 */
public interface MyStack<T>{
    void push(T e);
    T pop();
    boolean isEmpty();

    void pushAll(Iterable<T> src);
    void pushAllNew(Iterable<? extends T> src);

    void popAll(Collection<T> list);
    void popAllNew(Collection<? super T> list);

}
