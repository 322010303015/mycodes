class question25
{
    public static double percentage(double m,double p,double c,double s)
    {
        double t=m+p+c+s;
        double max_marks=80;
        double total_marks=max_marks*4;
        double pecent=t/total_marks;
        double total_percentage=pecent*100;
        return total_percentage;

    }
    public static void main(String[] args)
    {
        System.out.println("the percentage is "+percentage(62,72,70,58));
    }
}