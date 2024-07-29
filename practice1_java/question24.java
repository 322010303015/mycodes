class question24
{
    public static double si(double p,double t,double r)
    {
        double a=p*t*r;
        return a/100;
    }
    public static void main(String[] args)
    {
        System.out.println("the si is "+si(1000,2,2));
    }
}