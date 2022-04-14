import java.util.Scanner;

public class Lab6_Program_1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int a[] = new int[9];

		for(int i=0; i<a.length; i++)
		{
			System.out.print("A["+i+"] = ");
			a[i]=sc.nextInt();
		}
		int countodd=0, counteven=0;

		for(int i=0; i<a.length; i++)
		{
			if(a[i]%2==0)
			{
				counteven++;
			}
			if(a[i]%2!=0)
			{
				countodd++;
			}
		}
		System.out.println("Even No. : " +counteven);
		System.out.println("Odd No. : " +countodd);
	}
	
}