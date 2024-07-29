import java.util.*;
class uniquesele
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter the elements");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        HashSet<Integer> h1=new HashSet<>();
        for(int i=0;i<a.length;i++)
        {
            h1.add(a[i]);
        }
        System.out.println(h1);
    }
}