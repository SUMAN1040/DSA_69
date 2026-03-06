package com.dsa.lecture21;

import java.util.Arrays;

public class Methods {
    public static void main(String[] args) {
        String name = "Suman Kumar Dey";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf("a"));
        System.out.println("       Suman    ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
