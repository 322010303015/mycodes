class circle
{
    double radius;
    circle(double arg1)
    {
        radius=arg1;
    }
    double diameter()
    {
        return 2*radius;
    }
    double area()
    {
        return 3.14*radius*radius;
    }
    double circumference()
    {
        return 2*3.14*radius;
    }
}
