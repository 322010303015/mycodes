import java.util.*;
class gcd1
{
    public static void main(String[] args)
    {
        int n1=15;
        int n2=25;
        int gcd=1; //it also called hcf
        int large=n1>n2?n1:n2;
        for(int i=large/2;i>=2;i--)
        {
            if(n1%i==0 && n2%i==0)
            {
                gcd=i;
                break;
            }
        }
        System.out.println(gcd);
    }
}