class waterbottle
{
    String brand;
    int price;
    int quantity;
    void displaywaterbottle()
    {
        System.out.println(quantity+" liter"+" water bottle of "+brand+" is "+price);
    }
}
class mainwaterbottle
{
    public static void main(String[] args)
    {
        System.out.println("Main method started");
        waterbottle w1=new waterbottle();
        w1.brand="Tata";
        w1.price=20;
        w1.quantity=1;
        w1.displaywaterbottle();
    }
}