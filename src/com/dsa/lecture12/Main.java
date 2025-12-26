package com.dsa.lecture12;

public class Main {
    public static void main(String[] args) {
        //store a roll number
        int a = 19;

        //store a persons name
        String name = "Suman";

        //Store 5 roll number
        int roll_no = 23;

        //syntax
        //datatype[] variable name = new datatype[size];
        //store 5 roll_no:

        int[] rollNumber = new int[5];
        int[] roll = {23, 34, 454, 54, 33}; // data type represent what type of data store in this array
        // all the store data must be same data type


        int[] ros; //declaration of array, ros is getting defined in the stack
        ros = new int[5]; //initialisation: actual here object is being created in the memory (heap memory)
//        here like int[]-> datatype  (compile time)
//                    arr-> reference variable
//                    new int[5]: creating the object in heap memory (runtime)
//                      here new keyword use for create an objects
//                        dynamic memory allocation: at the runtime memory will allocate
//        1)array objects are in heap
//        2)jls - java language specification-internal working on java
//        3)heap objects are not continues--dynamic memory allocation
//        Hence: array objects in java may not be continues

//        [0, 0, 0, 0, 0]
//        System.out.println(ros[1]);


        String[] arr = new String[4];
        System.out.println(arr[0]);  // that might be give output null(special lateral)


        String str = null;
//        int num = null; // i cant assigned with primitive that only assign with non-primitive

        // that known none in python

        String[] array = new String[5];
        System.out.println(arr[0]);
//        primitive(Primitive types are the fundamental data types that store single values) are int, char, boolean, short, long, byte, double, float
//        In Java, non-primitive data types (also known as reference or object types) are user-defined data structures that store references to objects in memory rather than the actual values. Classes, Objects, Strings, Arrays, Interface, Enums

//        Classes: Blueprints for objects, defining their fields and methods.
//        Objects: Instances of classes. The Object class is the root of the Java class hierarchy.
//        Strings: Although predefined, String is a non-primitive type for character sequences and is immutable.
//                Arrays: Store multiple values of the same type and are treated as objects in Java.
//        Interfaces: Collections of abstract methods that define a contract for implementing classes.
//        Enums: Define a fixed set of constants.


        //  objects are store in stack memory (that point ref to heap memory )
        // Each particular elements of inside an array that stored as an objects

//        for (String element : arr) {
//            System.out.println(element);
//        }
    }
}
