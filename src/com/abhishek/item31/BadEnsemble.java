package com.abhishek.item31;

/**
 * Created by AbhishekPatel on 9/29/2017.
 */
public enum BadEnsemble {
    SOLO, DUET, TRIO, QUARTET, QUINTET,
    SEXTET, SEPTET, OCTET, NONET, DECTET;

    public int numberOfMusicians() {
        return ordinal() + 1;
    }

}
