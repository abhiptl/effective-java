package com.abhishek.item11;

/**
 * Created by AbhishekPatel on 9/17/2017.
 *
 * Item11 : Override clone judiciously
 */
public class App11 {
    public static void main(String[] args) {
        HashTableClass.Entry e1 = new HashTableClass.Entry("k1", "k1",  null);
        HashTableClass.Entry e2 = new HashTableClass.Entry("k2", "k2",  e1);

        HashTableClass.Entry[] buckets = new HashTableClass.Entry[2];
        buckets[0] = e1;
        buckets[1] = e2;

        HashTableClass hashTableClass = new HashTableClass(buckets);
        HashTableClass cloneHasTableClass = null;
        try {
            cloneHasTableClass = hashTableClass.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("Clone");
    }
}
