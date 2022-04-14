import java.util.Scanner;

public class Lab5_Program_4 {

    static int check(int x)
    {
        for(int i=2; i<x; i++)
        {
            if(x%i == 0) return 0;
        }
        return 1;
    }

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, isPrime;
        System.out.print("Enter Number : ");
        n = sc.nextInt();

        isPrime = check(n);

        if(isPrime == 1) System.out.println("PRIME");
        else System.out.println("NOT PRIME");
    }
}