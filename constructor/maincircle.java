class maincircle
{
    public static void main(String[] args)
    {
        System.out.println("Main Method started");
        circle c1=new circle(1.2);
        System.out.println("the diameter of the circle is "+c1.diameter());
        System.out.println("the area of the circle is "+c1.area());
        System.out.println("the circumference of the circle is "+c1.circumference());
        System.out.println("Main method ended");
    }
}