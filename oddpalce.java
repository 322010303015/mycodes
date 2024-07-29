import java.util.*;
class oddpalce
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arr1=new int[n];
        int j=0;
        int k=arr.length-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2!=0)
            {
                arr1[j++]=arr[i];
            }
            else
            {
                arr1[k--]=arr[i];
            }
            
        }
    
        System.out.println(Arrays.toString(arr1));

    }
}