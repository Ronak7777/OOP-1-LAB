import java.util.Scanner;

public class Lab6_Program_3 {
	public static void main(String[] args) {
		int a[] = {3,6,9,4,1,5}, key;
		boolean flag=false;

		System.out.print("Enter Search No. : ");

		Scanner sc = new Scanner(System.in);
		key = sc.nextInt();

		for(int i=0; i<a.length; i++)
		{
			if(a[i]==key){
				System.out.println("Found");
				flag=true;
			}
		}

		if(flag==false)
			System.out.println("Not Found");
	}
	
}