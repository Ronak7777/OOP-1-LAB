import java.util.Scanner;

public class Lab4_Program_4 {
    public static void main(String[] args) {
        int n;
        float sum=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Series Number : ");
        n = sc.nextInt();

        for(int i=1; i<=n; i++)
        {
            sum = sum + 1f/i;
        }

        System.out.println("Sum of 1/n series upto " +n+ " terms : " +sum);
    }
    
}
