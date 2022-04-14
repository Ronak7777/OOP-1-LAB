import java.util.Scanner;

public class Lab6_Program_4 {
    static void bubble_sort(int A[]){
        for(int i=0; i<A.length; i++)
        {
            for(int j=0; j<A.length-1; j++)
            {
                if(A[j]>A[j+1])
                {
                    int temp=A[j];
                    A[j]=A[j+1];
                    A[j+1]=temp;
                }
            }
        }
    }

	public static void main(String[] args) {
		int A[] = new int[3];
        int j=1, k=1;

		Scanner sc = new Scanner(System.in);
		for(int i=0; i<A.length; i++)
		{
			System.out.print("A["+ j +"] : ");
			A[i] = sc.nextInt();
            j++;
		}
    
        Lab6_Program_4 bs = new Lab6_Program_4();
        bs.bubble_sort(A);

        System.out.println("Sorted Array");
        for(int i=0; i<A.length; i++)
		{
			System.out.println("A["+ k +"] : " +A[i]);
            k++;
		}
	}
}