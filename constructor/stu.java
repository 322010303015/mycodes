import java.util.*;
class stu
{
    int stu_id;
    String stu_name;
    double stu_marks;
    stu(int arg1,String arg2,double arg3)
    {
        stu_id=arg1;
        stu_name=arg2;
        stu_marks=arg3;
    }
    void display()
    {
        System.out.println("Student name: "+stu_name+"\nstudent id: "+stu_id+"\nstudent marks: "+stu_marks);
    }
}
class mainstu
{
    public static void main(String[] args)
    {
        System.out.println("Main Method Started");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name");
        String name=sc.next();
        System.out.println("Enter the id");
        int id=sc.nextInt();
        System.out.println("Enter the marks");
        double marks=sc.nextDouble();
        stu s1=new stu(id,name,marks);
        s1.display();
        System.out.println("Main Method Ended");
        sc.close();
    }
}