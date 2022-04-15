import java.util.Scanner;

public class Lab3_Program_2{
	public static void main(String[] args){
		char c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Character : ");
		c = sc.next().charAt(0);

		if(c=='a' || c=='A' || c=='a' || c=='A' || c=='e' || c=='E' || c=='i' || c=='I' || c=='o' || c=='O' || c=='u' || c=='U')
		{
			System.out.println("Character is Vowel");
		}
		else{
			System.out.println("Character is Consonent");
		}
	}
}