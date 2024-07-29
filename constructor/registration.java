class registration
{
    String user_name;
    String password;
    long ph_no;
    String email_id;

    registration(String user_name,String password,long ph_no)
    {
        this.user_name=user_name;
        this.password=password;
        this.ph_no=ph_no;
    }
    registration(String email_id,String user_name,String password)
    {
        this.email_id=email_id;
        this.user_name=user_name;
        this.password=password;
    }
    registration(String password,long ph_no,String email_id,String user_name)
    {
        this.password=password;
        this.ph_no=ph_no;
        this.email_id=email_id;
        this.user_name=user_name;
    }
    void display()
    {
        System.out.println(this.user_name);
        System.out.println(this.password);
        System.out.println(this.ph_no);
        System.out.println(this.email_id);
    }
}
class mainregistration
{
    public static void main(String[] args)
    {
        System.out.println("main methos started");
        registration r1=new registration("yaswanth","tala-2002",8074006222l);
        r1.display();
        registration r2=new registration("ytalanki@gitam.in","yaswanth","tala-2002");
        r2.display();
        registration r3=new registration("tala-2002",8074006222l,"ytalanki@gitam.in","yaswanth");
        r3.display();
    }
}