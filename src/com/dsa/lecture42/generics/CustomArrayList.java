package com.dsa.lecture42.generics;

import java.util.ArrayList;

public class CustomArrayList {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; //always define in this index value

    public CustomArrayList() {
        this.data = new int[DEFAULT_SIZE];
    }

    public void add(int num) {
        if (this.isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private boolean isFull() {
        return size == data.length;
    }

    private void resize() {
        int[] temp = new int[data.length * 2];

        //copy the current items in the new array
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int remove() {
        int remove = data[--size];
        return remove;
    }

    public int get(int index) {
        return data[index];
    }

    public int size() {
        return size;
    }

    public void set(int index, int value) {
        data[index] = value;
    }

    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        list.add(String.valueOf(34));
//        list.remove(0);
//        list.get(0);
//        list.set(1, String.valueOf(1040));
//        list.size();
//        list.isEmpty();

        CustomArrayList list = new CustomArrayList();
        list.add(3);
        list.add(5);
        list.add(9);

        for (int i = 0; i < 14; i++) {
            list.add(i * 2);
        }
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        //list2.add("Suman"); //this known as generics there identify type
        list2.add(3);
    }
}
