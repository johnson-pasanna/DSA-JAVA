package com.john;

import java.util.Scanner;

public class IndianCurrencyToUSD {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the given indian amount");
        int inputCurrency = input.nextInt();
        double americanCurrency = inputCurrency*77.65;
        System.out.println("The given indian currency will be " +americanCurrency+ "$");
    }
}
