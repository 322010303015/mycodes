import java.util.*;
class food
{
    int quantity;
    String color;
    String type;
    food(int arg1,String arg2,String arg3)
    {
        quantity=arg1;
        color=arg2;
        type=arg3;
    }
    void display()
    {
        System.out.println("type is "+type+" colour is "+color+" "+quantity+" quantity");
    }
}
class mainfood
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter quantity");
        int q1=sc.nextInt();
        System.out.println("enter color");
        String s1=sc.next();
        System.out.println("enter type");
        String s2=sc.next();
        food f1=new food(q1,s1,s2);
        f1.display();
    }
}