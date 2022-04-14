import java.util.Scanner;

public class Lab6_Program_6 {
	public static void main(String[] args) {
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		int c[][] = new int[2][2];
		int sum;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Matrix");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print("a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter Second Matrix");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print("b["+i+"]["+j+"] : ");
				b[i][j] = sc.nextInt();
			}
		}

		for(int i=0; i<2; i++)
		{
			for(int k=0; k<2; k++)
			{
				sum=0;
				for(int j=0; j<2; j++)
				{
					sum += a[i][j]*b[j][i];
				}
				System.out.print("\tc["+i+"]["+k+"] = " +sum);
			}
			System.out.println();
		}

	}
}