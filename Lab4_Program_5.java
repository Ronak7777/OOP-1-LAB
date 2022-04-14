import java.util.Scanner;

public class Lab4_Program_5 {
    public static void main(String[] args){
        int n, rem, rev=0;
        String str = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number : ");
        n = sc.nextInt();

        while(n!=0)
        {
            rem = n%10;
            // rev = rev*10 + rem;
            str = str + rem;
            n=n/10;
        }

        System.out.println("Reverse Number : " + str);
    }
}
