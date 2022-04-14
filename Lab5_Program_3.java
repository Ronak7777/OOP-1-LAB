import java.util.Scanner;

public class Lab5_Program_3 {

    static void fabonacci(int a) {
        int n1, n2, n3;

        n1=0;
        n2=1;
        System.out.print(n1);
        System.out.print(n2);

        for (int i=0; i<a-2; i++)
        {
            n3 = n2+n1;
            System.out.print(n3);
            n1=n2;
            n2=n3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x;
        System.out.print("Fabonacci Series : ");
        x = sc.nextInt();

        fabonacci(x);
    }
}
