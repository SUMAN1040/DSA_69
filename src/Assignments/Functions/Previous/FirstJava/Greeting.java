//Take name as input and print a greeting message for that particular name.
package Assignments.Functions.Previous.FirstJava;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        greeting(name);
    }

    static void greeting(String name) {
        System.out.println("Hello " + name + "! Welcome to our Innox Platform");
    }
}
