import java.util.Scanner;

class Student {
	int eno;
	String name; 
	int semester;
	double spi;
	double cpi;

	public void GetStudentDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Enrollment_No : ");
		eno = sc.nextInt();

		sc.nextLine();
		System.out.print("Enter Name : ");
		name = sc.nextLine();

		System.out.print("Enter Semester : ");
		semester = sc.nextInt();

		System.out.print("Enter SPI : ");
		spi = sc.nextDouble();

		System.out.print("Enter CPI : ");
		cpi = sc.nextDouble();
	}

	public void DisplayStudentDetails() {

		System.out.println("\n -----|  Student Details are as follow |-----\n");
		
		System.out.println("Name : " +name);
		System.out.println("Enrollment_No : " +eno);
		System.out.println("Semester : " +semester);
		System.out.println("SPI : " +spi);
		System.out.println("CPI : " +cpi);
	}
}

public class Lab7_Program_4 {
	public static void main (String[] args) {
		Student stu = new Student();

		stu.GetStudentDetails();
		stu.DisplayStudentDetails();
	}
}
