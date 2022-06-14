package com.john;

import java.util.Scanner;

public class MathsCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first input number " );
        int firstNumber = input.nextInt();
        System.out.println("Please enter the second input number ");
        int secondNumber = input.nextInt();
        System.out.println("Please enter an Operator it could be '+' , '-' , '*' or '/' ");
        char givenOperator = input.next().charAt(0);

        if(givenOperator=='+'){
            int ans = firstNumber+secondNumber;
            System.out.println(ans);
        }else if(givenOperator=='-'){
            int ans =firstNumber-secondNumber;
            System.out.println(ans);
        }else if(givenOperator=='*'){
            int ans =firstNumber*secondNumber;
            System.out.println(ans);
        }else if(givenOperator=='/'){
            int ans=firstNumber/secondNumber;
            System.out.println(ans);
        } else{
            System.out.println("Plesae enter the correct Operator");
        }
        }
}
