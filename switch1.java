import java.util.Scanner;
class switch1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int count=0;
        if(a%2==0)
        {
            count++;
        }
        if(b%2==0)
        {
            count++;
        }
        if(c%2==0)
        {
            count++;
        }
        switch(count)
        {
            case 1:
                {
                    if(a%2==0)
                    {
                        System.out.println(a);
                    }
                    if(b%2==0)
                    {
                        System.out.println(b);
                    }
                    if(c%2==0)
                    {
                        System.out.println(c);
                    }
                    break;
                }
            case 2:
                {
                    if(a%2==0 && b%2==0 & c%2==0)
                    {
                        System.out.println(a+b+c);
                    }
                    if(a%2==0 && b%2==0)
                    {
                        System.out.println(a+b);
                    }
                    if(b%2==0 && c%2==0)
                    {
                        System.out.println(b+c);
                    }
                    if(c%2==0 && a%2==0)
                    {
                        System.out.println(a+b);
                    }

                    break;

                }
            case 3:
                {
                    System.out.println(a*b*c);
                    break;
                }
            case 0:
            {
                System.out.println(0);
            }
        }
    }
}