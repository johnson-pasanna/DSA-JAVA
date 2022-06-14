package com.john;

import java.util.Scanner;

public class printsum {
    public static void main(String[] args) {
        // 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.\

        Scanner input = new Scanner(System.in);
        int newNumber = input.nextInt();
        int finalAns = addNumber(newNumber);
        System.out.println(finalAns);
    }

    static int addNumber(int a) {
        int ans=0 ;
        while (a !='X') {

            ans = ans +a ;
            System.out.println(ans);
            System.exit(1);
            }

        return 0;
    }
}
