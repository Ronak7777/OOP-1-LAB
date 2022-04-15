import java.util.Scanner;

public class Lab3_Program_1 {
	public static void main(String[] args){
		int n;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number : ");
		n = sc.nextInt();

		if(n>0)
		{
			System.out.println("Number is Positive");
		}
		if(n<0)
		{
			System.out.println("Number is Negative");
		}
	}
}