import java.util.Scanner;

class Employee {
	int id;
	String name; 
	String designation;
	int age;
	double salary;

	public void GetAccountDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID : ");
		id = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();

		System.out.print("Enter Designation : ");
		designation = sc.nextLine();

		System.out.print("Enter Age : ");
		age = sc.nextInt();

		System.out.print("Enter Salary : ");
		salary = sc.nextDouble();
	}

	public void DisplayAccountDetails() {
		System.out.println("Name : " +name);
		System.out.println("ID : " +id);
		System.out.println("Designation : " +designation);
		System.out.println("Age : " +age);
		System.out.println("Salary : " +salary);
	}
}

public class Lab7_Program_3 {
	public static void main (String[] args) {
		Employee emp = new Employee();

		emp.GetAccountDetails();
		emp.DisplayAccountDetails();
	}
}
