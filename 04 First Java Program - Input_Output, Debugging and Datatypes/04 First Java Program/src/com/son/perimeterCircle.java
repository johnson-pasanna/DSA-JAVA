package com.john;

import java.util.Scanner;

public class perimeterCircle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //the formula is 2 * Pi * R
        int inputRadius = input.nextInt();
        double perimeter = Math.PI;
        double perimeterCircle = 2 * perimeter * inputRadius;
        System.out.println(perimeterCircle);
    }

}
