package com.company;
import java.util.Scanner;

public class Lab2_Program_1 {
    public static void main(String[] args) {
        int a,b,sum;

        System.out.print("Enter two Number : ");

        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        sum = a+b;
        System.out.println("Sum = " + sum);
    }
}
