//package com.dsa.lecture42.generics;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class WildCardExample <T extends Number>{
//    private Object[] data;
//    private static int DEFAULT_SIZE = 10;
//    private int size = 0; //always define in this index value
//
//    public WildCardExample() {
//        this.data = new Object[DEFAULT_SIZE];
//    }
//
//    public void getList(List<? extends Number> list) {
//        // do something
//    }
//}
//
//    public void add(T num) {
//        if (this.isFull()) {
//            resize();
//        }
//        data[size++] = num;
//    }
//
//    private boolean isFull() {
//        return size == data.length;
//    }
//
//    private void resize() {
//        Object[] temp = new Object[data.length * 2];
//
//        //copy the current items in the new array
//        for (int i = 0; i < data.length; i++) {
//            temp[i] = (T) (data[i]);
//        }
//        data = temp;
//    }
//
//    public T remove() {
//        T remove = (T) (data[--size]);
//        return remove;
//    }
//
//    public T get(int index) {
//        return (T) data[index];
//    }
//
//    public int size() {
//        return size;
//    }
//
//    public void set(int index, T value) {
//        data[index] = value;
//    }
//
//    @Override
//    public String toString() {
//        return "CustomArrayList {" + "data=" + Arrays.toString(data) + ", size=" + size + '}';
//    }
//
//    public static void main(String[] args) {
//
//        WildCardExample list = new WildCardExample();
////        list.add(3);
////        list.add(5);
////        list.add(9);
//
////        for (int i = 0; i < 14; i++) {
////            list.add(i * 2);
////        }
////        System.out.println(list);
//
//        ArrayList<Integer> list2 = new ArrayList<>();
////        list2.add(3);
//
//        WildCardExample<Number> list3 = new WildCardExample<>();
//        for (int i = 0; i < 14; i++) {
//            list3.add(2 * i);
//        }
//        System.out.println(list3);
//}
