import java.util.*;
class program4
{
    public static void gst(double n)
    {
        double gstamount=n*.18;
        double total=n+gstamount;
        System.out.println("the total price of the product is"+total);
    }
    public static void sum_avg(double x,double y,double z)
    {
        double tot=x+y+z;
        System.out.println("the total amount is "+tot);
        double avg=tot/3;
        System.out.println("the average of 3 numbers is "+avg);
    }
    public static void main(String[] args)
    {
        sum_avg(1,2,3);
        //gst(1000);
    }
}