class demo4
{
    int x=25;
    int y=30;
}
class mainclass4
{
    public static void main(String[] args)
    {
        demo4 d1=new demo4();
        d1.x=50;
        d1.y=60;
        //re-initialize of the d1 (d1 value change if we re-initialize)
        d1=new demo4();
        System.out.println("D1 of x is "+d1.x); //25
        System.out.println("D1 of y is "+d1.y); //0

    }
}