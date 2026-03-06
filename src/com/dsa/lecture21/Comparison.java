package com.dsa.lecture21;

public class Comparison {
    public static void main(String[] args) {
        String a = "Suman";
        String b = "Suman";

        //==
        System.out.println(a == b);

        String name1 = new String("Suman");;
        String name2 = new String("Suman");

        System.out.println(name1 == name2);
        System.out.println(name1.charAt(0));
    }
}
