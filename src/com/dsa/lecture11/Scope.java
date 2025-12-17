package com.dsa.lecture11;

public class Scope {
    public static void main(String[] args) {
        int a = 10;
        int b = 23;
        String name = "Suman";

        {
            name = "Kumar";
            a = 54; //here basically reassign the original ref variables to some other value
            System.out.println(a);
            int c = 99;
            //values initialized in this block, will remain in block
            System.out.println(name);
        }
//        System.out.println(c); // can't use outside the block

//    Scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num = 99;
            a = 1000000000;
        }
        System.out.println(a);
    }


    //    Where we can access our variables
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
