import java.util.Scanner;

public class Lab3_Program_6{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		int n1, n2, n3;
		char ch;

		System.out.print("Enter n1 & n2 : ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();

		System.out.print("Enter Operator : ");
		ch = sc.next().charAt(0);

		switch(ch)
		{
			case '+':
				n3 = n1+n2;
				System.out.println("Addition = " + n3);
				break;

			case '-':
				n3 = n1-n2;
				System.out.println("Subtraction = " + n3);
				break;

			case '*':
				n3 = n1*n2;
				System.out.println("Multiplication = " + n3);
				break;

			case '/':
				n3 = n1/n2;
				System.out.println("Division = " + n3);
				break;

			default :
				System.out.println("INVALID OPERATOR");

		}

	}
}