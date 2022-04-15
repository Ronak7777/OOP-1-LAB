import java.util.Scanner;

class Bank_Account {
	long actno;
	String name; 
	String email;
	String acttype;
	double balance;

	public void GetAccountDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Account_No : ");
		actno = sc.nextLong();

		System.out.print("Enter Name : ");
		name = sc.nextLine();

		System.out.print("Enter Email : ");
		email = sc.nextLine();

		System.out.print("Enter Account_Type : ");
		acttype = sc.nextLine();

		System.out.print("Enter Balance : ");
		balance = sc.nextDouble();
	}

	public void DisplayAccountDetails() {
		System.out.println("Name : " +name);
		System.out.println("Account_Type : " +acttype);
		System.out.println("Account_No : " +actno);
		System.out.println("Email : " +email);
		System.out.println("Balance : " +balance);
	}
}

public class Lab7_Program_2 {
	public static void main (String[] args) {
		Bank_Account acc = new Bank_Account();

		acc.GetAccountDetails();
		acc.DisplayAccountDetails();
	}
}