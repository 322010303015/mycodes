class demo1
{
    int x=10;
    int y=20;
    void test()
    {
        System.out.println("running test function");
    }
}
class mainclass1
{
    public static void main(String[] args)
    {
        System.out.println("Main method stated");
        demo1 d1=new demo1();
        System.out.println("d1 is "+d1);
        demo1 d2=new demo1();
        System.out.println("d2 is "+d2);
        System.out.println("Main method ended");
    }
}