
import java.util.Scanner;

public class Lab4_Program_1 {
    public static void main(String[] args) {
        int first,last;
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First & Last Number : ");
        first = sc.nextInt();
        last = sc.nextInt();

        for (int i=first; i<=last; i++)
        {
            if(i%2==0 && i%3!=0)
            {
                System.out.println("Result : "+i);
            }
        }
    }
}
