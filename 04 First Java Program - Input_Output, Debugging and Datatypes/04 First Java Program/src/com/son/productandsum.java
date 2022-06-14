package com.son;

public class productandsum {
    //    https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer
    public static void main(String[] args) {
        //ans= 234 = 2*3*4 -2+3+4 = 15
        //sol1>>
        int n = 234;
        int ans = sumDigits(n);
        System.out.println(ans);
        //convert the given integer to string then iterate each string
    }

//    static int stringConversion(int str) {
//        String newt = str + "";
//        int sum =0;
//        for(int index=0; index<newt.length(); index++){
//            System.out.println(newt.charAt(index));
//            sum=newt.charAt(index);
//            System.out.println(sum);
//        }
//        System.out.println(sum);
//  return sum;
//    }

    static int sumDigits(int num) {
        //function which takes integer value and returns sum of the digits
        int sum =0;
        while(num!=0){
            sum += num%10;
            num = num/10;
        }
return sum;
    }
}


