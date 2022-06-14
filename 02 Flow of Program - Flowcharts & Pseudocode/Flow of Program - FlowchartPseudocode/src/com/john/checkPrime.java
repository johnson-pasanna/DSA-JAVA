package com.john;

import java.util.Scanner;

public class checkPrime {
    //prime no; 1 , 3, 5, 7 , 9 , 11
    // no divisible by 1 and itself only


    public static void main(String[] args) {
        int c = 2;
        int num = 4;
        int ans = checkPrimeNo(c, num);
        System.out.println(ans);
//        Scanner inputNmae = new Scanner(System.in);
//        given num%c=0 means not prime if not zero then update c by c+1 inititally c=2;
    }

    static int checkPrimeNo(int c, int num) {
        c =2;
        while (c*c <= num) {
            if (num % c == 0) {
                System.out.println("not prime");
            } else {
                c += 1;
            }
        }return 1;
    }
}


