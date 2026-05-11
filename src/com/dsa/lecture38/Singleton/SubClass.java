package com.dsa.lecture38.Singleton;

import com.dsa.lecture40.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }
}

class SubSubClass extends SubClass {
    public SubSubClass(int num, String name) {
        super(num, name);
    }
    public static void main(String[] args) {
        SubSubClass obj = new SubSubClass(1040, "Suman Kumar Dey");
        int n = obj.num;
    }
}

class SubClass2 extends A {
    public SubClass2(int num, String name) {
        super(num, name);
    }
}