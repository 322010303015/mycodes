class question13
{
    public static double area_of_pentagon(double perimeter,double apothem)
    {
        return 0.5*perimeter*apothem;
    }
    public static void main(String[] args)
    {
        System.out.println("the area of pentagon is "+area_of_pentagon(2,6));
    }
}