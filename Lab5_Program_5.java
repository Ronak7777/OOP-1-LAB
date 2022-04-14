import java.util.Scanner;

public class Lab5_Program_5 {

    static double area(double rad) {
        return Math.PI*rad*rad;
    }

    static double area(double b, double h) {
        return (0.5)*b*h;
    }

    static int area(int s) {
        return s*s;
    }

    public static void main(String[] args) {
        int side;
        double radius, base, hypotenuse, AreaOfCircle, AreaOfSquare, AreaOfTriangle;
        Scanner sc = new Scanner(System.in);

        // [1] --> Area of Circle
        System.out.print("Enter Radius of Circle : ");
        radius = sc.nextDouble();
        AreaOfCircle = area(radius);
        System.out.println("Area of Circle : " +AreaOfCircle);

        // [2] --> Area of Triangle
        System.out.print("Enter Base of Triangle : ");
        base = sc.nextDouble();

        System.out.print("Enter Hypotenuse of Triangle : ");
        hypotenuse = sc.nextDouble();
        
        AreaOfTriangle = area(base, hypotenuse);
        System.out.println("Area of Triangle : " +AreaOfTriangle);

        // [3] --> Area of Square
        System.out.print("Enter Side of Square : ");
        side = sc.nextInt();
        AreaOfSquare = area(side);
        System.out.println("Area of Square : " +AreaOfSquare);
    }
}
