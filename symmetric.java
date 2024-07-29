import java.util.*;
public class symmetric
{
    public static int findn2(int n,int len)
    {
        int n2=0;
        for(int i=1;i<=len/2;i++)
        {
            int d=n%10;
            n2=n2*10+d;
            n=n/10;
        }
        return reverse(n2);
    }
    public static int findn1(int n,int len)
    {
        for(int i=1;i<=len/2;i++)
        {
            n/=10;
        }
        return n;
    }
    public static int reverse(int n)
    {
        int rev=0;
        while(n>0)
        {
            rev=rev*10+n%10;
            n=n/10;
        }
        return rev;
    }
    public static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            c++;
            n/=10;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int original=n;
        int co=count(n);
        int half=co/2;
        
        if(co%2==0)
        {
            int n2=findn2(n,co);
            int n1=findn1(n,co);
            System.out.println(n1);
            System.out.println(n2);
            // int first=n%100;
            // int sec=n/100;
            int s=n1+n2;
            System.out.println("The sum is "+s);
            int squ=s*s;
            if(squ==n)
            {
                System.out.println("The number is symmetric");
            }
            else
            {
                System.out.println("The number is not symmetric");
            }
        }
        else
        {
            System.out.println("Invalid Number");
        }
    }
}