package com.john;

import java.util.Scanner;

public class permiterParallelogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //the formula is P = 2(a+b)
        int inputbase = input.nextInt();
        int inputSide = input.nextInt();
        int permiterParallelogram = 2 * (inputbase + inputSide);
        System.out.println(permiterParallelogram);
    }
}