import java.util.*;
class lcm1
{
    public static int lcm(int n1,int n2)
    {
        int large=n1>n2?n1:n2;
        for(int i=large;;i++)
        {
            if(i%n1==0 && i%n2==0)
            {
                return i;
            }
            i++;
        }
    }
    public static void main(String[] args)
    {
        System.out.println(lcm(25,15));
    }
}