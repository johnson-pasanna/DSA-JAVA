package com.john;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        //Simple Interest = Principal Amount * Tune * Rate of interest / 100
        Scanner input = new Scanner(System.in);
        int principalAmount = input.nextInt();
        int time = input.nextInt();
        int rateOfInterest = input.nextInt();
        int simpleInterest = (principalAmount*time*rateOfInterest)/100;
        System.out.println("The Simple Interest of given value is " + simpleInterest);
    }
}
