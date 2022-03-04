import java.util.Scanner;

public class Program35{
    public static void main(String[] args) {
        int a,b,c;

        System.out.print("Enter 3 Number : ");
        Scanner sc = new Scanner(System.in);
        
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

       int max = (a>b)?((a>c)?a:c):((b>c)?b:c); 
       
       System.out.println(max);
        
    }
}
