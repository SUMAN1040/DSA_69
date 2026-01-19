package com.dsa.lecture13;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInStrings {
    static boolean search(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }


    static boolean search2(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String name = "Suman";
        char charSearch = 'u';
        System.out.println("After checking the value result is: ");
        System.out.println(search2(name, charSearch));

        System.out.println(Arrays.toString(name.toCharArray()));
    }
}
