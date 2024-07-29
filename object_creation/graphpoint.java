class graphpoint
{
    double x_axis;
    double y_axis;
    void displaycoordinates()
    {
        System.out.println("("+x_axis+","+y_axis+")");
    }
}
class maingraph
{
    public static void main(String[] args)
    {
        System.out.println("Main method started");
        graphpoint p1=new graphpoint();
        p1.x_axis=5.6;
        p1.y_axis=6.7;
        p1.displaycoordinates();
        System.out.println("---------------------");
        graphpoint p2=new graphpoint();
        p2.x_axis=3.2;
        p2.y_axis=4.1;
        p2.displaycoordinates();
    }
}