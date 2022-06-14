package com.son;

public class factorsOfNumber {
    public static void main(String[] args) {
        int num = 10;

        System.out.println( "Factors of " + num + " are " );

        // finding and printing factors b/w 1 to num
        int digits =0;
        for(int i = 1; i <= num; i++)
        {
            if(num % i == 0){
                System.out.println(i + " ");
            digits++;
            }
        }
        System.out.println(digits);
    }
}
