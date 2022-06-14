package com.son;

public class futureinvestmentvalue {
    public static void main(String args[])
    {
        //Present Investment Value
        double pv=50000;
        //Rate of Return
        double r=8;
        //Time Period in Number of Years
        double t=10;

        //calculating future value by using formula
        double fv=pv*Math.pow((1+r/100),t);
        System.out.print("Future Investment Value is: "+fv);
    }
}
