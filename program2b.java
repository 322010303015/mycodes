import java.util.*;
class program2b
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int h=sc.nextInt();
        if(h>=5 && h<=1)
        {
            System.out.println("Good Morning");
        }
        else if(h>=12 && h<=16)
        {
            System.out.println("Good afternoon");

        }
        else if(h>=17 && h<=20)
        {

            System.out.println("Good evening");
        }
        else if(h>=21 && h<=24 || h>=0 && h<=4)
        {
            System.out.println("Good night");
        }
    }
}