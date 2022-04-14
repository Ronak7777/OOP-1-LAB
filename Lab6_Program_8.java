import java.util.Scanner;

public class Lab6_Program_8{
	public static void main(String[] args) {
		int A[][] = new int[4][4];
		int r_sum=0, c_sum=0;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Matrix");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print("A["+i+"]["+j+"] : ");
				A[i][j] = sc.nextInt();
			}
            System.out.println();
		}

		System.out.println("---| Matrix Form |---");
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				System.out.print("A["+i+"]["+j+"] : " +A[i][j]);
                System.out.print("\t");
			}
            System.out.println();
		}

        for(int i=0; i<4; i++)
		{
			for(int j=0; j<4; j++)
			{
				r_sum += A[i][j];
                c_sum += A[j][i];
			}
		}
        System.out.println("Sum of Rows : " +r_sum);
        System.out.println("Sum of Rows : " +c_sum);
	}
}