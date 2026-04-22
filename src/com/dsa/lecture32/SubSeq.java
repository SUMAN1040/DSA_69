package com.dsa.lecture32;

import java.util.ArrayList;

public class SubSeq {

    static void subseq(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        subseq(p + ch, up.substring(1));
        subseq(p, up.substring(1));
    }

    static ArrayList<String> subSeqReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = subSeqReturn(p + ch, up.substring(1));
        ArrayList<String> right = subSeqReturn(p, up.substring(1));

        left.addAll(right);
        return left;
    }

    static void subSeqAscii(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);
        subSeqAscii(p + ch, up.substring(1));
        subSeqAscii(p, up.substring(1));
        subSeqAscii(p + (ch + 0), up.substring(1));
    }

    static ArrayList<String> subSeqAsciiReturn(String p, String up) {
        if (up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        char ch = up.charAt(0);
        ArrayList<String> first = subSeqAsciiReturn(p + ch, up.substring(1));
        ArrayList<String> second = subSeqAsciiReturn(p, up.substring(1));
        ArrayList<String> third = subSeqAsciiReturn(p + (ch + 0), up.substring(1));

        first.addAll(second);
        first.addAll(third);
        return first;
    }

    public static void main(String[] args) {
        System.out.println(subSeqAsciiReturn("", "abc"));
//        subSeqAscii("", "abc");
    }
}