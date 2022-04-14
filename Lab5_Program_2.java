import java.util.Scanner;

public class Lab5_Program_2 {

    static void max(int a, int b)
    {
        if(a>b) System.out.println("A is Maximum");
        else if(y<x) System.out.println("B is Maximum");
        else System.out.println("A equal to B");
    }

    public static void main (String[] args) {
        int x,y;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number : ");
        x = sc.nextInt();
        y = sc.nextInt();

        max(x,y);
    }
}