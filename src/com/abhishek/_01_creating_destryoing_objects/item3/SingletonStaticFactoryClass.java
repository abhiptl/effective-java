package com.abhishek._01_creating_destryoing_objects.item3;

import java.io.*;

/**
 * Created by AbhishekPatel on 9/11/2017.
 *
 * To maintain singleton guarantee , all instance variable should be transient and provide readResolve() implementation
 */
public class SingletonStaticFactoryClass implements Serializable {

    // Mandatory fields else java.io.InvalidClassException will be thrown
    private static final long serialVersionUID = 1113799434508676095L;

    private static final SingletonStaticFactoryClass INSTANCE = new SingletonStaticFactoryClass();

    private static int COUNTER = 0;

    private int instanceVariable = 100;

    private SingletonStaticFactoryClass() {
        COUNTER++;
    }

    public static SingletonStaticFactoryClass getInstance() {
        return INSTANCE;
    }

    public static int getCounter() {
        return COUNTER;
    }

    public int getInstanceVariable() {
        return instanceVariable;
    }

    public void setInstanceVariable(int instanceVariable) {
        this.instanceVariable = instanceVariable;
    }

    /* private Object readResolve() {
        *//*Return the one true Elvis and let the garbage collector
        take care of the SingletonStaticFactoryClass impersonator.*//*
        return INSTANCE;
    }*/

    public static void read() throws Exception {
        SingletonStaticFactoryClass singletonStaticFactoryClass = null;
        FileInputStream fis = new FileInputStream("singleton.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        singletonStaticFactoryClass = (SingletonStaticFactoryClass)ois.readObject();
        System.out.println("Instance variable :" + singletonStaticFactoryClass.getInstanceVariable());
        System.out.println("Counter :" + SingletonStaticFactoryClass.getCounter());
    }

    public static void write() throws Exception {
        SingletonStaticFactoryClass singletonStaticFactoryClass = SingletonStaticFactoryClass.getInstance();
        FileOutputStream fos = new FileOutputStream("singleton.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(singletonStaticFactoryClass);
    }
}
