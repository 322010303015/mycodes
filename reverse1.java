import java.util.*;
class reverse1
{
    public static void main(String[] args)
    {
        int n=123;
        int s=0;
        while(n>0)
        {
            int rev=n%10;
            s=(s*10)+rev;
            n=n/10;
        }
        System.out.println(s);
    }
}