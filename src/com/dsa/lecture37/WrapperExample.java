package com.dsa.lecture37;

public class WrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        int b = 20;

//        Integer num = 40;
        Integer a = 20;
        Integer b = 30;
        swap(a, b);

        final A suman = new A("Bhai");
        suman.name = "Change";

    }
    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}

class A {
    final int num = 10;
    String name;

    public A(String name) {
        System.out.println("Object Created");
        this.name = name;
    }

//    @Override
//    protected void finalize() throws Throwable {
//        System.out.println("Object is destroyed");
//    }
}
