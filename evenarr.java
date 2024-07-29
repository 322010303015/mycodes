import java.util.*;
class evenarr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("The even numbers in the array are:");
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.println(a[i]);
            }
        }
    }
}