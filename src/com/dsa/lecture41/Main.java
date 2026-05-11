package com.dsa.lecture41;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(23);
        son.career();

        son.normal();

        Daughter daughter = new Daughter(12);
        daughter.career();

//        Parent mom = new Parent();  //can't create abstract object like this format

        Parent.hello();
    }
}