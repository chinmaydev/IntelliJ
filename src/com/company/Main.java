package com.company;

public class Main {

    public static void main(String[] args) {
     String string = "aaq12312";
        extracted(string);
        int i = 1;
    }

    private static void extracted(String string) {
        System.out.println(string);
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Replicate Conflict - Remote");
        System.out.println("Replicate Conflict - Local");
    }
}
