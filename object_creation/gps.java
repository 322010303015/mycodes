class gps
{
    double longtitude;
    double latitude;
    String direction;
    void displaygps()
    {
        System.out.println("("+longtitude+","+latitude+","+direction+")");
    }
}
class maingps
{
    public static void main(String[] args)
    {
        System.out.println("Main Method Started");
        gps g1=new gps();
        g1.longtitude=3.1314214;
        g1.latitude=1.241526525;
        g1.direction="Easy-west";
        g1.displaygps();
    }
}
