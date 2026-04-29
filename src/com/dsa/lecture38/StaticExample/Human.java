package com.dsa.lecture38.StaticExample;

public class Human {
    int age;
    String name;
    int salary;
    boolean married;
    static long population;


    static void massage(){
        System.out.println("Hello massage Trigger");
//        System.out.println(this.age);
    }
    public Human(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.married = married;
        Human.population += 1;

        Human.massage();
    }
}
