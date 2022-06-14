package com.john;

import java.util.Scanner;

public class numberEvenorOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int givenNumber = input.nextInt();
        if(givenNumber%2==0){
            System.out.println("The number is even ");
        }else{
            System.out.println("Number is odd");
        }
    }
}
