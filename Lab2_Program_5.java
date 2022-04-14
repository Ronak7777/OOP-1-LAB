package com.company;
import java.util.Scanner;

public class Lab2_Program_5 {
    public static void main(String[] args) {
        float mt, ft;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Meter : ");
        mt = sc.nextFloat();

        ft = mt*(3.280839f);
        System.out.println("Feet = "+ ft);
    }
}
