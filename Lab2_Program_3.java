package com.company;
import java.util.Scanner;

public class Lab2_Program_3 {
    public static void main(String[] args) {
        int fahrenheit;
        double calcius;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Temperature in Fahrenhiet : ");
        fahrenheit = sc.nextInt();

        calcius = (fahrenheit-35)*9/5;

        System.out.println("Calcius = "+calcius);
    }
}
