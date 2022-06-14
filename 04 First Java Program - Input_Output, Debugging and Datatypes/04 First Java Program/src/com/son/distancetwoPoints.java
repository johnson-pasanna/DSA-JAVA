package com.son;

import java.util.Scanner;

public class distancetwoPoints {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the horizontal axis value X1 ");
        float horizontal1= input.nextInt();
        System.out.println("Please enter the vertical axis value Y1 ");
        float vertical1 = input.nextInt();
        System.out.println("Please enter the horizontal axis value X2 ");
        float horizontal2 = input.nextInt();
        System.out.println("Please enter the vertical axis value Y2 ");
        float vertical2 = input.nextInt();
        float horizontalValue = horizontal2-horizontal1;
        System.out.println(horizontalValue);
        float verticalValue = vertical2-vertical1;
        System.out.println(verticalValue);
        float intermediteValue = (horizontalValue*horizontalValue)+ (verticalValue*verticalValue);
        System.out.println(intermediteValue);
        Double squareroot = Math.pow(intermediteValue, 0.5);
        System.out.println(squareroot);
    }
}
