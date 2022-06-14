package com.son;

import java.util.Scanner;

public class dicountProductt {
    //1>> convert the percentage into decimal
    //2 >> multiply the orignal price by the decimal
    //3>> subtract the original price by dicount display the output
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the product price");
        int productPrice = input.nextInt();
        System.out.println("Please enter the discount percentage");
        float discountPercentage = input.nextInt();
        float dicountPrice = discountPercentage*productPrice;
        float dicountInDigits = dicountPrice/100;
        float actualPrice = productPrice-dicountInDigits;
        System.out.println(actualPrice);
    }
}
