import java.util.Scanner;

class Candidate {
	int id;
	String name; 
	int age;
	int weight;
	int height;

	public void getCandidateDetails() {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter ID : ");
		id = sc.nextInt();

		System.out.print("Enter Name : ");
		name = sc.nextLine();

		System.out.print("Enter Age : ");
		age = sc.nextInt();

		System.out.print("Enter Weight : ");
		weight = sc.nextInt();

		System.out.print("Enter Height : ");
		height = sc.nextInt();
	}

	public void DisplayCandidateDetails() {
		System.out.println("Name : " +name);
		System.out.println("ID : " +id);
		System.out.println("Age : " +age);
		System.out.println("Weight : " +weight);
		System.out.println("Height : " +height);
	}
}

public class Lab7_Program_1 {
	public static void main (String[] args) {
		Candidate c = new Candidate();

		c.getCandidateDetails();
		c.DisplayCandidateDetails();
	}
}