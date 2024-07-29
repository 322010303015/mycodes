class notebook
{
    int pages;
    double price;
    String brand;
    String size;
}
class mainnotebook
{
    public static void main(String[] args)
    {
        notebook n1=new notebook();
        System.out.println(n1.pages);
        System.out.println(n1.price);
        System.out.println(n1.brand);
        System.out.println(n1.size);
        n1.pages=100;
        n1.price=40;
        n1.brand="Lepakshi";
        n1.size="Small";
        System.out.println(n1.pages+" pages book");
        System.out.println("the book cost is "+n1.price);
        System.out.println("the brand is "+n1.brand);
        System.out.println("the size of the book is "+n1.size);
    }
}