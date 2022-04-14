
import java.util.Scanner;

public class Lab4_Program_6 {
    public static void main(String[] args) {
        int n, OddResult=0, EvenResult=0;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number to print sum and enter 0 for exit : ");
        while(true)
        {
            n = sc.nextInt();

            if(n>0 && n%2==0)
            {
                EvenResult = EvenResult + n;
            }

            if(n<0 && n%2!=0)
            {
                OddResult = OddResult + n;
            }

            if(n==0)
            {
                break;
            }
        }

        System.out.println("Sum of Even Positive Number : " +EvenResult);
        System.out.println("Sum of Odd Negative Number : " +OddResult);
    }
}