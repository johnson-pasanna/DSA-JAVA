package com.john;

import java.util.Scanner;

public class VVIFIbonacciSeries {
    public static void main(String[] args) {
        // fibonachi number
        //0 1 1 2 3 5 8
        //0 first
        // 1 second
        // 1 = 0+1 first + second
        // 2 = 1+1 frist + second
        // 3 = 2+1 frist(second) + second(first = nextnumber)
        // 5 = 3+2
        // 8 = 5+3
        Scanner input = new Scanner(System.in);
        int num =input.nextInt();
        int firstNumber = 0;
        int secondNumber = 1;
        System.out.println(firstNumber);
        System.out.println(secondNumber);

        for(int index =0; index<num; index++){
//            index = index + sum;
        int nextNumber = firstNumber + secondNumber;
        firstNumber =secondNumber;
        secondNumber = nextNumber;
            System.out.println(nextNumber);
        }

    }
}

