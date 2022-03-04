import java.util.Scanner;

public class Program37{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a, b, c;

        System.out.print("Enter 3 sides of triangle : ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a==b && b==c && c==a)
        {
            System.out.println("Equilateral Triangle");
        }
        else if(a==b || b==c || c==a)
        {
            System.out.println("Isoscales Triangle");
        }
        else if(a*a + b*b == c*c)
        {
            System.out.println("Right Angled Triangle");
        }
        else{
            System.out.println("Scalene Triangle");
        }
    }
}