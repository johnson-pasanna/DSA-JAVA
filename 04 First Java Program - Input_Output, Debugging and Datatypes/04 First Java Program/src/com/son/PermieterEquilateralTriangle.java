package com.john;

import java.util.Scanner;

public class PermieterEquilateralTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //the formula is P = 3*a where a is side
        int inputSideArea = input.nextInt();
        double perimeterEquilateralTriange = 3 * inputSideArea;
        System.out.println(perimeterEquilateralTriange);
    }
}
