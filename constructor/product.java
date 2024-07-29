import java.util.*;
class product
{
    double unique;
    double price;
    product(double arg1,double arg2)
    {
        unique=arg1;
        price=arg2;
    }
    void display()
    {
        System.out.println("id is "+unique+" price is "+price);
    }
}
class mainproduct
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        double d1=Math.random();
        System.out.println("enter the price");
        double pr=sc.nextDouble();
        product p1=new product(d1,pr);
        p1.display();
    }
}