import java.util.Scanner;
class fact
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int prod=1;
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            prod=prod*i;
        }
        System.out.println(prod);
    }
}