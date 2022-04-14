import java.util.Scanner;

public class Lab5_Program_1 {

    static double simple_interest(double amount, double time, double rate) {
        return (amount*time*rate)/100;
    }

    public static void main (String[] args) {
        int p, t, r;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle in Amount : ");
        p = sc.nextInt();

        System.out.print("Enter Time in Second : ");
        t = sc.nextInt();

        System.out.print("Enter Rate : ");
        r = sc.nextInt();

        double x = simple_interest(p,t,r);

        System.out.println(x);
    }
}