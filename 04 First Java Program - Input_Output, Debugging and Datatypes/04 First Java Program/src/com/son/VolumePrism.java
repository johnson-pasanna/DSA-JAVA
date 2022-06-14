package com.son;

import java.util.Scanner;

public class VolumePrism {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the length");
        int length = in.nextInt();
        System.out.println("Please enter the width");
        int width = in.nextInt();
        System.out.println("Please enter the height");
        int height = in.nextInt();

       double volumeofPrism = 0.5*length*width*height;
        System.out.println(volumeofPrism);

    }
}
