public class Lab5_Program_6{
    static int gcd (int n1, int n2)
    {
        while(n1!=n2)
        {
            if(n1>n2)
            {
                n1 = n1-n2;
            }
            else
            {
                n2 = n2-n1;
            }
        }
        return n1;
    }
    
    public static void main(String[] args) {
        System.out.println(gcd(4,6));
    }
}
