class chat
{
    String name;
    String text;
    String date;
    long phno;
}
class mainchat
{
    public static void main(String[] args)
    {
        chat c1=new chat();
        System.out.println(c1.name);
        System.out.println(c1.text);
        System.out.println(c1.date);
        System.out.println(c1.phno);
        c1.name="jagadeesh";
        c1.text="hello";
        c1.date="13-06-2024";
        c1.phno=9902942484l;
        System.out.println(c1.name);
        System.out.println(c1.text);
        System.out.println(c1.date);
        System.out.println(c1.phno);
    }
}