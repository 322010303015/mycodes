import java.util.*;
class prime
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        sc.close();
        int flag=1;
        if(n==0||n==1)
        {
            System.out.println(n+" is not a prime");
        }
        else
        {
            for(int i=2;i<n;i++)
            {
                if(n%i==0)
                {
                    System.out.println(n+" is not a prime");
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.println(n+" is a prime");
            }
        }
    }
}