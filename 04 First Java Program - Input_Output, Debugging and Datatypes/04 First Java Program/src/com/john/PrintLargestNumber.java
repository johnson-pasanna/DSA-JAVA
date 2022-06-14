package com.john;

import java.util.Scanner;

public class PrintLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first input number");
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second input number");
        int secondNumber = input.nextInt();
        if(firstNumber>secondNumber){
            System.out.println("The largest no is"+ firstNumber);
        }else if(firstNumber<secondNumber){
            System.out.println("The largest no is " + secondNumber);
        }else{
            System.out.println("both are equal hence no largest number");
        }

    }
}
