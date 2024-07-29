class question14
{
    public static double area_of_semicircle(double r)
    {
        double a=3.14*r*r;
        return a/2;
    }
    public static void main(String[] args)
    {
        System.out.println("The area of semicircle is"+area_of_semicircle(5));
    }
}