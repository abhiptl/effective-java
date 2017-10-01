package com.abhishek._06_methods.item39;

import java.util.Date;

/**
 * Created by AbhishekPatel on 10/1/2017.
 */
public class RepairedImmutablePeriod {

    private final Date start;
    private final Date end;

    /**
     * Repaired constructor - makes defensive copies of parameters
     *
     * @param start the beginning of the period
     * @param end the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public RepairedImmutablePeriod(Date start, Date end) {
        this.start = new Date(start.getTime());
        this.end = new Date(end.getTime());

        if (this.start.compareTo(this.end) > 0)
            throw new IllegalArgumentException(start +" after "+ end);
    }
    public Date start() {
        return new Date(start.getTime());
    }

    public Date end() {
        return new Date(end.getTime());
    }

}
