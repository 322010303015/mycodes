import java.util.*;
public class sumarr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        int n[]=new int[size];
        System.out.println("Enter the elements of the array");
        int sum=0;
        for(int i=0;i<size;i++)
        {
            n[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++)
        {
            sum=sum+n[i];
        }
        System.out.println("sum of the array is "+sum);
        int pro=1;
        for(int i=0;i<size;i++)
        {
            pro=pro*n[i];
        }
        System.out.println("product of the array is "+pro);
        System.out.println("Average of the array is "+sum/size);
    }
}