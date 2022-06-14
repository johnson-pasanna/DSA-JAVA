package com.john;

import java.util.Scanner;

public class addNumber{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int numberOne = input.nextInt();
        int numberTwo = input.nextInt();
        int ans = addingTwoNumber(numberOne , numberTwo);
        System.out.println(ans);
    }
    static int addingTwoNumber(int a, int b){
        return a+b;
    }

}
