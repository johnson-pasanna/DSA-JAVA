package com.john;

import java.util.Scanner;

public class multiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int inputValue = input.nextInt();
        // 4 is the input
        // 4*1=4
        //4*2=8
        for (int index = 1; index <= 10; index++) {
            System.out.println("" + inputValue + "* " + index + "= " + (inputValue * index));
        }
    }
}
