package com.son;

public class compoundInterest {

//    Compound Interest = P(1 + R/100)^r
//            Where,
//    P is principle amount
//    R is the rate and
//    T is the time span
    public static void main(String args[]) {
        double principle = 10000, rate = 10.25, time = 5;

        /* Calculate compound interest */
        double CI = principle *
                (Math.pow((1 + rate / 100), time));

        System.out.println("Compound Interest is " + CI);
    }
}