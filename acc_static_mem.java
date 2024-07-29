class demo1
{
    static int x=1000;
    static int y=2000;
    static void name()
    {
        System.out.println("Yaswanth");
    }
}
class demo3
{
    int x1=40;
    int y1=50;
    void age()
    {
        System.out.println("26");
    }
}
class demo6
{
    public static void main(String[] args)
    {
        System.out.println("The static variables before re-initialize");
        System.out.println(demo1.x);
        System.out.println(demo1.y);
        demo1.name();
        System.out.println("The static variable after re-initialize");
        demo1.x=5000;
        demo1.y=6000;
        System.out.println(demo1.x);
        System.out.println(demo1.y);
        System.out.println("The access of non-static variable and function");
        System.out.println(new demo3().x1);
        System.out.println(new demo3().y1);
        new demo3().age();
    }
}