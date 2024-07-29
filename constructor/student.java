class student
{
    int id;
    String name;
    double marks;
    student(int arg1,String arg2,double arg3)
    {
        id=arg1;
        name=arg2;
        marks=arg3;
    }
    void display()
    {
        System.out.println("Name is "+name+"id is"+id+"marks are "+marks);
    }
}
class mainstudent
{
    public static void main(String[] args)
    {
        System.out.println("Main method started");
        student s1=new student(3015,"yaswanth",87.2);
        s1.display();
        System.out.println("Main methos ended");
    }
}