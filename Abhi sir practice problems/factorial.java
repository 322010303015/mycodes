import java.util.*;
class factorial
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n1= sc.nextInt();
        double n=1;
        for(int i=1;i<=n1;i++)
        {
            n=n*i;
        }
        System.out.println(n);
    }
}