import java.util.Scanner;

public class Lab4_Program_3
 {
    public static void main(String[] args) {
        int n;
        System.out.print("Enter Number : ");

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=2; i<n; i++)
        {
            if(n%i == 0)
            {
                System.out.println("Not a Prime Number");
                break;
            }
            else
                System.out.println("Prime Number");
                break;
        }
    }
    
}
