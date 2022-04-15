import java.util.Scanner;

public class Lab3_Program_4{
	public static void main(String[] args){
		int m1, m2, m3, m4, m5, sum, per;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Marks : ");
		m1 = sc.nextInt();
		m2 = sc.nextInt();
		m3 = sc.nextInt();
		m4 = sc.nextInt();
		m5 = sc.nextInt();

		sum = m1+m2+m3+m4+m5;
		per = (sum/5);

		System.out.println("Percentage of Subject : " + per);

		if(per>=75)
		{
			System.out.println("Distinction");
		}
		else if(per>=60 && per<75)
		{
			System.out.println("First Class");
		}	
		else if(per>=45 && per<60)
		{
			System.out.println("Second Class");
		}
		else if(per>=35 && per<45)
		{
			System.out.println("Third Class");
		}
		else
		{
			System.out.println("FAIL");
		}
	}
}