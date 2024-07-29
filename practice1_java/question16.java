class question16
{
    public static double perimeter_of_semi_circle(double r)
    {
        double a=3.14*r;
        return a+2*r;
    }
    public static void main(String[] args)
    {
        System.out.println("The perimeter of the circle is"+perimeter_of_semi_circle(5));
    }
}