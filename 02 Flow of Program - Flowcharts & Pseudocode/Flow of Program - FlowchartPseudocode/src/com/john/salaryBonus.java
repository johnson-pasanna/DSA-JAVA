package com.john;

public class salaryBonus {
    public static void main(String[] args) {
        int salary = 9000;
        int ans= checkSalary(salary);
        System.out.println(ans);
    }

        static int checkSalary(int sal){
            if(sal> 10000) sal += 2000;
            else sal = sal + 1000;
            return sal;
    }
}
