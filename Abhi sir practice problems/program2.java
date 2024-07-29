import java.util.*;
class program2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=sc.nextDouble();
        if(n<0)
        {
            System.out.println(n+" is a negative number");
        }
        else if(n>0)
        {
            System.out.println(n+" is a positive number");
        }
        else
        {
            System.out.println(n+" is zero");
        }
        
    }
}