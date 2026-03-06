package com.dsa.lecture21;

public class Performance {
    public static void main(String[] args) {
        String series = "";
        for (int i = 0; i < 26; i++) {
            char letter = (char) ('a' + i);
            series += letter;
        }
        System.out.println(series);
    }
}
