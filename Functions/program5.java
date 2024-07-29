class program5
{
    public static void diameter(double r)
    {
        double dia=2*r;
        System.out.println("the diameter of the circle is"+dia);
    }

    public static void area(double r)
    {
        final double pi=3.14;
        double ar=pi*r*r;
        System.out.println("the area of the circle is"+ar);
    }
    public static void circumference(double r)
    {
        final double pi=3.14;
        double cir=2*pi*r;
        System.out.println("the circumference of the circle"+cir);
    }
    public static void main(String[] args)
    {
        diameter(5);
        area(5);
        circumference(5);
    }
}