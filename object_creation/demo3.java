class demo3
{
    int x=10;
    int y=20;
    void test()
    {
        System.out.println("Running the test method");
    }
}
class mainclass3
{
    public static void main(String[] args)
    {
        demo3 d1=new demo3();
        demo3 d2=d1;
        System.out.println("d1 is "+d1); //same address
        System.out.println("d2 is "+d2); //same address
        d1.x=100;
        d1.y=200;
        System.out.println("d2 of x is "+d2.x); //100
        System.out.println("d2 of y is "+d2.y); //200
        System.out.println("Modifing the d1 object values");
        System.out.println("d1 of x is "+d1.x); //100
        System.out.println("d1 of y is "+d1.y); //200
    }
}