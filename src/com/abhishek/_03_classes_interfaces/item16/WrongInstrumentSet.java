package com.abhishek._03_classes_interfaces.item16;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by AbhishekPatel on 9/19/2017.
 */
public class WrongInstrumentSet<E> extends HashSet<E> {
    // The number of attempted element insertions
    private int addCount = 0;

    public WrongInstrumentSet() {
    }

    public WrongInstrumentSet(int initCap, float loadFactor) {
        super(initCap, loadFactor);
    }

    @Override
    public boolean add(E e) {
        addCount++;
        return super.add(e);
    }

    @Override
    public boolean addAll(Collection<? extends E> c) {
        addCount += c.size();
        return super.addAll(c);
    }

    public int getAddCount() {
        return addCount;
    }

}
