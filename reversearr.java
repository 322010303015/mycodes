import java.util.*;
public class reversearr
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }
        System.out.println("Length of the array is "+arr.length);
        System.out.println("The reverse array is");
        for(int k=arr.length-1;k>=0;k--)
        {
            System.out.print(arr[k]+" ");
        }
    }
}