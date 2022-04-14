import java.util.Scanner;

public class Lab6_Program_7 {

    static void selction_sort(int A[]){
        for(int i=0; i<A.length; i++)
        {
            int min_index = i;

            for(int j=i+1; j<A.length; j++)
            {
                if(A[j]<A[min_index])
                {
                    min_index = j;
                }
            }
            int temp = A[i];
            A[i] = A[min_index];
            A[min_index] = temp;
        }
    }

    static void print_arr(int A[])
    {
        int j=1;
        for(int i=0; i<A.length; i++)
		{
			System.out.println("A["+ j +"] : " +A[i]);
            j++;
		}
    }

	public static void main(String[] args) {
        Lab6_Program_7 sort = new Lab6_Program_7();

		int A[] = new int[3];
        int j=1;
    
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Array");
		for(int i=0; i<A.length; i++)
		{
			System.out.print("A["+ j +"] : ");
			A[i] = sc.nextInt();
            j++;
		}

        sort.selction_sort(A);

        System.out.println("Sorted Array");
        sort.print_arr(A);

	}
}