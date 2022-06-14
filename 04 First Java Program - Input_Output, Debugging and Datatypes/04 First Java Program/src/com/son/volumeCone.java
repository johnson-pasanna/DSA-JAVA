package com.john;

import java.util.Scanner;

public class volumeCone {
    //V=π*r*r*(h/3)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the Radius ");
        int inputRadius = input.nextInt();
        double piValue = Math.PI;
        System.out.println("Please input the Height ");
        int inputHeight = input.nextInt();

        double volumeofCone = piValue * (inputRadius*inputRadius) *inputHeight/3;
        System.out.println("THe volume of cone is " + volumeofCone);
    }
}
