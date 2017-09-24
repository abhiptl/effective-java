package com.abhishek.item18;

/**
 * Created by AbhishekPatel on 9/22/2017.
 */
public abstract class AbstractDriver implements Driver {

    @Override
    public void drive() {
        System.out.println("Drive");
    }


}


interface Driver {
    void drive();
    void getExperience();
}

class BusDriver extends AbstractDriver {
    @Override
    public void getExperience() {
        System.out.println("BusDriver : getExperience");
    }
}

class TruckDriver extends AbstractDriver {
    @Override
    public void getExperience() {
        System.out.println("TruckDriver : getExperience");
    }
}
