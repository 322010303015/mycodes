import java.util.*;
class largerof2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        int n=sc.nextInt();
        System.out.println("enter the number 2");
        int m=sc.nextInt();
        if(n>m)
        {
            System.out.println(n+" is greater");
        }
        else
        {
            System.out.println(m+" is greater");
        }
    }
}