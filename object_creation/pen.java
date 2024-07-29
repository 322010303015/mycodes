class pen
{
    String brand;
    String colour;
    double price;
}
class mainpen
{
    public static void main(String[] args)
    {
        pen p1=new pen();
        System.out.println(p1.brand);  //null
        System.out.println(p1.colour); //null
        System.out.println(p1.price);  //0.0
        p1.brand="Cello";
        p1.colour="Black";
        p1.price=25.00;
        System.out.println(p1.brand);  //Cello
        System.out.println(p1.colour); //Black
        System.out.println(p1.price);  //25.0

    }
}