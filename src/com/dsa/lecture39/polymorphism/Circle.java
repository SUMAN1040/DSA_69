package com.dsa.lecture39.polymorphism;

public class Circle extends Shapes {
    //This will run when obj of Circle is created
    //Hence it is overring the parent method
    @Override //this is called annotation
    void area() {
        System.out.println("Area is 3.14*side*side");
    }
}
