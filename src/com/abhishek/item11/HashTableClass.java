package com.abhishek.item11;

/**
 * Created by AbhishekPatel on 9/17/2017.
 */
public class HashTableClass implements Cloneable {
    private Entry[] buckets;

    public HashTableClass(Entry[] buckets) {
        this.buckets = buckets;
    }

    public static class Entry {
        final Object key;
        Object value;
        Entry next;
        Entry(Object key, Object value, Entry next) {
            this.key = key;
            this.value = value;
            this.next = next;
        }

        Entry deepCopy() {
            return new Entry(key, value,
                    next == null ? null : next.deepCopy());
        }

    }

    /*
    // violating clone
    @Override
    protected HashTableClass clone() throws CloneNotSupportedException {
        return (HashTableClass) super.clone();
    }*/

    /*
    // violating
    @Override
    protected HashTableClass clone() throws CloneNotSupportedException {
        HashTableClass result = (HashTableClass) super.clone();
        result.buckets = buckets.clone();
        return result;
    }*/

    @Override
    protected HashTableClass clone() throws CloneNotSupportedException {
        HashTableClass result = (HashTableClass) super.clone();
        result.buckets = new Entry[buckets.length];
        for (int i = 0; i < buckets.length; i++)
            if (buckets[i] != null)
                result.buckets[i] = buckets[i].deepCopy();
        return result;
    }

}
