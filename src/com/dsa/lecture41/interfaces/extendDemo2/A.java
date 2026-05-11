package com.dsa.lecture41.interfaces.extendDemo2;

public interface A {
    //static interface methods should always have a body;
    //call via this interface name
    static void greeting(){
        System.out.println("Hey i am static");
    }

    default void fun(){
        System.out.println("Hey this is default implementation");
    }
}
