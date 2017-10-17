package com.abhishek._08_exceptions.item61;

/**
 * Item 61: Throw exceptions appropriate to the abstraction
 */
public class App61 {
    public static void main(String[] args) throws Exception {
        VictimClass victimClass = new VictimClass();
        try {
            victimClass.throwLowLevel();
        } catch (LowLevelException low) { // Exception chaining
            throw new HighLevelException(low.getCause());
        }
    }
}

class VictimClass {
    public void throwLowLevel() throws LowLevelException {

    }
}

class HighLevelException  extends Exception{
    HighLevelException(Throwable throwable) {
        super(throwable);
    }
}

class LowLevelException extends Exception {
    LowLevelException(Throwable throwable) {
        super(throwable);
    }
}