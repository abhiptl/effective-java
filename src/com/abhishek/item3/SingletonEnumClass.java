package com.abhishek.item3;

/**
 * Created by AbhishekPatel on 9/11/2017.
 *
 * It provides the serialization machinery for free, and provides an
 * ironclad guarantee against multiple instantiation, even in the face of sophisticated
 * serialization or reflection attacks.
 */
public enum SingletonEnumClass {
    INSTANCE;
}
