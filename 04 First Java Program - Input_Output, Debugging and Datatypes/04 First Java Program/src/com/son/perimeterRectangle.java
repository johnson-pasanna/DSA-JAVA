package com.john;

import java.util.Scanner;

public class perimeterRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //the formula is P = 2(l+w)
        int inputlength = input.nextInt();
        int inputWidth= input.nextInt();
        int permiterRectangle = 2 * (inputlength + inputWidth);
        System.out.println(permiterRectangle);
    }
}
