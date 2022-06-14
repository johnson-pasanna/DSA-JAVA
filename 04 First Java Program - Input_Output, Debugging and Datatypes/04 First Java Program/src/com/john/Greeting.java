package com.john;

import java.util.Scanner;

public class Greeting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
//        String name= "johnson";
        System.out.println("Hello there "+ name);
    }
}
