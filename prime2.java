import java.util.Scanner;
class prime2
{
    public static boolean isprime(int n)
    {
        if(n<=1)
            return false;
        int c=2;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
                c++;
        }
        return c==2;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println(isprime(n));
    }
}