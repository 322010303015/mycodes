import java.util.*;
class evenodd
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        double n=sc.nextDouble();
        if(n%2==0)
        {
            System.out.println(n+" is a even number");
        }
        else
        {
            System.out.println(n+" is a odd number");
        }
    }
}