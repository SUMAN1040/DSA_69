package com.dsa.lecture40.access;

public class ObjectDemo {

    int num;
//    int val;
    String name;

//    @Override
//    public String toString() {
//        return super.toString();
//    }
//
//    @Override
//    protected void finalize() throws Throwable {
//        super.finalize();
//    }

    public ObjectDemo(int num, String name) {
        this.num = num;
//        this.val = 73;
        this.name = name;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj1 = new ObjectDemo(10, "Suman");
        ObjectDemo obj2 = new ObjectDemo(10, "Dey");

        if(obj1 == obj2){
            System.out.println("obj1 is equal to obj2");
        }
        if(obj1.equals(obj2)){
            System.out.println("obj1 is equal to obj2");
        }

        System.out.println(obj1.getClass());
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}