package com.son;

import java.util.Scanner;

public class Factorial {
    //logic Input= 5factorial  Output=5*4*3*2*1 = 120
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int givenInput = input.nextInt();
        int sum =1;
        for(int index=1; index<=givenInput; index++){
         sum = sum*index;
        }
        System.out.println(sum);
    }
}
