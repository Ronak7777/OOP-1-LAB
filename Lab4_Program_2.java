import java.util.Scanner;

public class Lab4_Program_2 {
	public static void main(String[] args) {
		int a, fact=1;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		a = sc.nextInt();

		for(int i=1; i<=a; i++)
		{
			fact=fact*i;
		}

		System.out.println("Factorial : " +fact);
	}
}