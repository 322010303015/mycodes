import java.util.*;
class mobile
{
    double price;
    String model;
    String company;
    String color;
    mobile(double arg1,String arg2,String arg3,String arg4)
    {
        price=arg1;
        model=arg2;
        company=arg3;
        color=arg4;
    }
    void display()
    {
        System.out.println("the company name is "+company+" "+model+"\n price is "+price+"\n color is "+color);
    }
}
class mainmobile
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("main methos Started");
        System.out.println("enter the price");
        double pr=sc.nextDouble();
        System.out.println("enter the model");
        String mo=sc.next();
        System.out.println("enter the company");
        String co=sc.next();
        System.out.println("enter the color");
        String col=sc.next();
        mobile m1=new mobile(pr,mo,co,col);
        m1.display();
    }
}