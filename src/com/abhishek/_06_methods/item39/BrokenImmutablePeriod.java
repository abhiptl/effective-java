package com.abhishek._06_methods.item39;

import java.util.Date;

/**
 * Created by AbhishekPatel on 10/1/2017.
 */
public class BrokenImmutablePeriod {
    private final Date start;
    private final Date end;
    /**
     * @param start the beginning of the period
     * @param end the end of the period; must not precede start
     * @throws IllegalArgumentException if start is after end
     * @throws NullPointerException if start or end is null
     */
    public BrokenImmutablePeriod(Date start, Date end) {
        if (start.compareTo(end) > 0)
            throw new IllegalArgumentException(
                    start + " after " + end);
        this.start = start;
        this.end = end;
    }
    public Date start() {
        return start;
    }

    public Date end() {
        return end;
    }
}
