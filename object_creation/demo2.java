class demo2
{
    int x=10;
    int y=20;
    void test()
    {
        System.out.println("Running main Method");
    }
}
class mainclass2
{
    public static void main(String[] args)
    {
        demo2 d1=new demo2();
        demo2 d2=new demo2();
        System.out.println("Modifing the d1 values");
        d1.x=100;
        d1.y=200;
        System.out.println("x value of d1 is "+d1.x); //100
        System.out.println("y value of d1 is "+d1.y); //200
        System.out.println("Printing the values of d1");
        System.out.println("x value of d2 is "+d2.x); //10
        System.out.println("y value of d2 is "+d2.y); //20
    }
}