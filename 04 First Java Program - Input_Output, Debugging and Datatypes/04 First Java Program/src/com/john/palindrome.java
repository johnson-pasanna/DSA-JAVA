package com.john;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the first number");
//        String givenNumber = input.next();
        String givenValue = "JOHNNHOJ";
        givenValue = givenValue.toLowerCase();
        // passing bool function till holding true
        if (isPalindrome(givenValue))

            // It is a palindrome
            System.out.print("Yes");
        else

            // Not a palindrome
            System.out.print("No");
    }

//        if (checkDigits(givenNumber) % 2 == 0) {
////
//        } else {
//            System.out.println("Given no is not prime");
//        }
//    }
//    static int checkDigits(int a){
//        String temp;
//        temp = a + "";
//        int length = temp.length();
//        return length;
//    }

    //Returning true if string is palindrome
    static boolean isPalindrome(String str) {
        int i = 0; // pointer pointing to beganing of string
        int j = str.length()-1; //pointer pointing to end of string.
        while (i < j) {
            System.out.println("chat of i " + i + "chat at j " + j);
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

}






