package com.dsa.lecture12;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Syntax
        ArrayList<Integer> list = new ArrayList<>(10); //
//        list.add(53);
//        list.add(23);
//        list.add(12);
//        list.add(42);
//
//        System.out.println(list);
//        System.out.println(list.contains(53));
//        list.set(0, 99);
//        System.out.println(list);
//        list.remove(2);
//        System.out.println(list);


        //input
        for (int i = 0; i < 5; i++) {
            list.add(in.nextInt());
        }
        //get item in any index
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i)); //pass index here, list[index] not work here
        }
        System.out.println(list);
    }
}
