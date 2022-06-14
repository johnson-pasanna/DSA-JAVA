package com.john;

public class checkLeapYear {
    public static void main(String[] args){
//        no divide by 4 == 0 means leap year
        int num = 2004;
//        int checkprime =num/4;
        if(num%4==0){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
    }
}
