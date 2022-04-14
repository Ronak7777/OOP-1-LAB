package com.company;
import java.util.Scanner;

public class Lab3_Program_8 {
    public static void main(String[] args) {
        int calls;
        double Bills;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Calls : ");
        calls = sc.nextInt();

        if(calls<=100)
        {
            Bills = 200;
            System.out.println("Bills = " + Bills);
        }
        else if(calls>100 && calls<=150)
        {
            Bills = 200 + (calls-100)*6/10;
            System.out.println("Bills = " + Bills);
        }
        else if(calls>150 && calls<=200)
        {
            Bills = 200 + 30 + (calls-150)*5/10;
            System.out.println("Bills = " + Bills);
        }
        else
        {
            Bills = 200 + 30 + (calls-200)*4/10;
            System.out.println("Bills = " + Bills);
        }

    }
}
