import java.util.Scanner;

public class Lab6_Program_2{
	public static void main(String[] args) {
		int sum=0;

		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];

		for(int i=0; i<a.length; i++)
		{
			System.out.print("A["+i+"] = ");
			a[i]=sc.nextInt();
		}

		for(int i=0; i<a.length; i++)
		{
			if(a[i]%3==0 || a[i]%5==0)
			{
				sum=sum+a[i];
			}
		}
		System.out.println("Sum of No. : " +sum);
	}
	
}