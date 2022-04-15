import java.util.Scanner;

public class Lab3_Program_3{
	public static void main(String[] args){
		int n1, n2, n3;
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter 3 number : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();

		if(n1>n2)
		{
			if(n1>n3)
			{
				System.out.println(n1 + " is Largest");
			}
			else
			{
				System.out.println(n3 + " is Largest");
			}
		}
		
		else
		{
			if(n2>n3)
			{
				System.out.println(n2 + " is Largest");
			}
			else
			{
				System.out.println(n3 + " is Largest");
			}
		}

	}
}