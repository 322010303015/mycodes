import java.util.*;
class prime1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        int c=2;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                c++;
            }
        
        }
        if(c==2)
        {
            System.out.println("it is a prime");
        
        }
        else
        {
            System.out.println("it's not a prime");
        }
    }
}