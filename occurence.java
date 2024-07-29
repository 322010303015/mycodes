import java.util.*;
class occurence
{
    public static int occ(int n[],int ele)
    {
        int c=0;
        for(int i=0;i<n.length;i++)
        {
            if(n[i]==ele)
            {
                c++;
            }

        }
        return c;
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the search ele");
        int search=sc.nextInt();
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("the occurence of "+search+" is "+occ(arr,search));
    }
}