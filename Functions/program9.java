class program9
{
    public static void main(String[] args)
    {
        double p1=500;
        double p2=500;
        double p3=500;
        double p4=500;
        double res=p1+p2+p3+p4;  //1996
        double dis=res*.10;
        if(res>=2000)
        {
            dis=res*.20;
        }
        double total=res-dis;
        System.out.println("the total is"+total);

    }
}