package com.dsa.lecture40;

public class SubClass extends A{

    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Suman Kumar Dey");
        int n =  obj.num;

        System.out.println(obj instanceof A);
    }
}
