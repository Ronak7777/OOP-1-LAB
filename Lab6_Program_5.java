import java.util.Scanner;

public class Lab6_Program_5 {
	public static void main(String[] args) {
		int A[][] = new int[2][2];
		int sum;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter First Matrix");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print("A["+i+"]["+j+"] : ");
				A[i][j] = sc.nextInt();
			}
		}

		System.out.println("---| Matrix Form |---");
		for(int i=0; i<2; i++)
		{
			for(int j=0; j<2; j++)
			{
				System.out.print("\tA["+i+"]["+j+"] : " +A[i][j]);
			}
            System.out.println();
		}
	}
}