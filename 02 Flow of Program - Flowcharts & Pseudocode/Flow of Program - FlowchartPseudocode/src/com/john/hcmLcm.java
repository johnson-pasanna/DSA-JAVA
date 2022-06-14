package com.john;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class hcmLcm {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Please enter the first Number");
//        int firstNumber = input.nextInt();
//        System.out.println("Please enter the second number");
//        int secondNumber = input.nextInt();
//        input.close();
////        int[] dividerList={};
//        ArrayList array = new ArrayList();
//        System.out.println(array);
//
//        System.out.println(checkinglcm(firstNumber, secondNumber));
//    }
//
//
//        static int checkinglcm(int a,int b){
//            int[] arraylist = {};
//            for(int checkDvider =1; checkDvider<=a; checkDvider++){
//                if(checkDvider%a==0){
//                    System.out.println(checkDvider);
//                }
//            }return -1;
//        }


        // Decalring avriables and taking values from user.
        int t1, t2, no1, no2, temp, hcf, lcm;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number ");
        no1 = scanner.nextInt();
        System.out.print("Enter Second Number ");
        no2 = scanner.nextInt();
        scanner.close();
// pass number to temp variables..
        t1 = no1;
        t2 = no2;
// checking condtrion for lc and Hcf..
        while (t2 != 0) {
            temp = t2;
            t2 = t1 % t2;
            t1 = temp;
        }
        hcf = t1;
        lcm = (no1 * no2) / hcf;
// Printing the result..
        System.out.println("HCF of input numbers: " + hcf);
        System.out.println("LCM of input numbers: " + lcm);
    }
}
