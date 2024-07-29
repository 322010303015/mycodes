import java.util.*;
class address
{
    String house_no;
    String street_name;
    String city;
    String state;
    address(String arg1,String arg2,String arg3,String arg4)
    {
        house_no=arg1;
        street_name=arg2;
        city=arg3;
        state=arg4;
    }
    void display()
    {
        System.out.println(house_no+" "+street_name+" "+city+" "+state);
    }
}
class mainaddress
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the house number");
        String s1=sc.next();
        System.out.println("enter the street name");
        String s2=sc.next();
        System.out.println("enter the city name");
        String s3=sc.next();
        System.out.println("enter the state");
        String s4=sc.next();
        address a1=new address(s1,s2,s3,s4);
        a1.display();
    }
}
