import java.util.*;
public class frequency
{
    public static void fre(int[] arr)
    {
        int visited=-1;
        for(int i=0;i<arr.length;i++)
        {
            int c=1;
            if(arr[i]!=visited)
            {
                for(int j=i+1;j<arr.length;j++)
                {
                    if(arr[i]==arr[j])
                    {
                        c++;
                        arr[j]=visited;
                    }
                }
                System.out.println(arr[i]+":"+c);  
            }          
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a={2,3,2,4,3};
        fre(a);      
    }
}