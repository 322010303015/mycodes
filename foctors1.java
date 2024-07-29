import java.util.Scanner;
class foctors1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        System.out.print("1, ");
        int c=0;
        for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+", ");
                c++;
            }
        }
        System.out.print(n);
        System.out.println("\n"+(c+2)+" factors ");
    }
}