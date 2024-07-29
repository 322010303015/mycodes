import java.util.*;
class smallof3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers");
        int ramu=sc.nextInt();
        int raghu=sc.nextInt();
        int raju=sc.nextInt();
        if(ramu<0 || raghu<0 || raju<0)
        {
            System.out.println("age is invalid");
        }
        else if(ramu<=raghu && ramu<=raju)
        {
            System.out.println(ramu+" is the youngest");
            
        }
        else if(raghu<=ramu && raghu<=raju)
        {
            System.out.println(raghu+" is the youngest");
        }
        else
        {
            System.out.println(raju+" is the youngest");
        }
    }
}