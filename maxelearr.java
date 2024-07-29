import java.util.*;
class maxelearr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of the array ");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("The maximum element is "+arr[n-1]);
        System.out.println("The minimum element is "+arr[0]);
        System.out.println("The 2nd largest element is "+arr[n-2]);
        
    }
}