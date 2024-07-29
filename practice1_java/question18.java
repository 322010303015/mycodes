class question18
{
    public static double total_surface_area_of_cuboid(double l,double w,double h)
    {
        double a=l*w;
        double b=w*h;
        double c=l*h;
        double d=a+b+c;
        return 2*d;
    }
    public static void main(String[] args)
    {
        System.out.println("The total surface area of cuboid is "+total_surface_area_of_cuboid(5,6,7));
    }
}