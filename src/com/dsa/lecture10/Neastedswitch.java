package com.dsa.lecture10;

import java.util.Scanner;

public class Neastedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String department = in.next();

        switch (empID){
            case 1:
                System.out.println("Suman Kumar Dey");
                break;
            case 2:
                System.out.println("Hello");
                break;
            case 3:
                System.out.println("Emp Number 3");
                switch (department){
                    case "IT":
                        System.out.println("It");
                        break;
                    case "Management":
                        System.out.println("management");
                        break;
                    default:
                        System.out.println("enter right department");
                }
                break;
            default:
                System.out.println("Suman");
        }
    }
}
