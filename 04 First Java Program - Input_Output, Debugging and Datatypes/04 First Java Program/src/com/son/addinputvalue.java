package com.son;

import java.util.Scanner;

public class addinputvalue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int ans = findNum(num);
        System.out.println(ans);
    }
        static int findNum(int n){
            int sum = n;
            while (n!= 0) {
                sum = sum + n;
            }
            return sum;
        }
}
