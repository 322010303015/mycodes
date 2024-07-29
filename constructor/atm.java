import java.util.*;
class atm
{
    double atm_no;
    String bank_name;
    String user_name;
    atm(double arg1,String arg2,String arg3)
    {
        atm_no=arg1;
        bank_name=arg2;
        user_name=arg3;
    }
    void display()
    {
        System.out.println("bank name is "+bank_name+" username is "+user_name+" atm no. is "+atm_no);
    }
}
class mainatm
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the atm no");
        double d1=sc.nextDouble();
        System.out.println("enter the bank name");
        String b1=sc.next();
        System.out.println("enter the user name");
        String u1=sc.next();
        atm a1=new atm(d1,b1,u1);
        a1.display();
    }
}