import java.util.*;
class armstrong
{
    public static int count(int n)
    {
        int c=0;
        while(n>0)
        {
            n=n/10;
            c++;
        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int temp=n;
        double r;
        int dig=count(n);
        double sum=0;
        while(temp>0)
        {
            r=temp%10;
            sum=sum+Math.pow(r,dig);
            temp=temp/10;
        }
        if(n==sum)
        {
            System.out.println("its a armstrong");
        }
        else
        {
            System.out.println("its a not armstrong");
        }

    }
}