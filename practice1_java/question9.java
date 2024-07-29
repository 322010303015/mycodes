class question9
{
    public static double surface_area_of_cone(double l,double r)
    {
        double a=l+r;
        return 3.14*r*a;
    }
    public static void main(String[] args)
    {
        System.out.println("The surface area of cone is "+surface_area_of_cone(5,6));
    }
}