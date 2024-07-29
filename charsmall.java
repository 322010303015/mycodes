import java.util.*;
class charsmall
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1");
        char n=sc.next().charAt(0);
        System.out.println("enter the number 2");
        char m=sc.next().charAt(0);
        if(n<m)
        {
            System.out.println(n+" is small");
        }
        else
        {
            System.out.println(m+" is small");
        }
    }
}