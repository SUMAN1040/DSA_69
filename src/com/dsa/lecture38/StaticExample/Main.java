package com.dsa.lecture38.StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human suman = new Human(22, "Suman Kumar Dey", 5000000, false);
//        System.out.println(suman.name);
//        System.out.println(suman.population);


    }

    // this is not dependent on objects
    static void fun() {
        //greeting(); //you can't use this bcoz it requires an instance, but the function you are using it in does not depend on instances


        //you can't access non-static stuff without referencing their instances in a static context
        //Hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }

    //We know that something which is not static, belongs to an object
    void greeting() {
        fun();
        System.out.println("Hello Bhai");
    }
}
