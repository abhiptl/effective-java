package com.abhishek._06_methods.item38;

import java.math.BigInteger;

/**
 * Created by AbhishekPatel on 10/1/2017.
 */
public class PublicMethods {
    /**
     * Returns a BigInteger whose value is (this mod m). This method
     * differs from the remainder method in that it always returns a
     * non-negative BigInteger.
     *
     * @param m the modulus, which must be positive
     * @return this mod m
     * @throws ArithmeticException if m is less than or equal to 0
     */
    public BigInteger mod(BigInteger m) {
        if (m.signum() <= 0)
            throw new ArithmeticException("Modulus <= 0: " + m);
        // Do the computation
        return null;
    }
}
