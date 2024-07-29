class question26
{
    public static double area_of_trapezoid(double base1,double base2,double h)
    {
        double a=base1+base2;
        double b=a/2;
        return b*h;
    }
    public static void main(String[] args)
    {
        System.out.println("The area of trapezoid is "+area_of_trapezoid(5,5,5));
    }
}