import java.util.*;
class switchcasereg
{
    String user_name;
    String password;
    long ph_no;
    String email_id;

    switchcasereg(String user_name,String password,long ph_no)
    {
        this.user_name=user_name;
        this.password=password;
        this.ph_no=ph_no;
    }
    switchcasereg(String email_id,String user_name,String password)
    {
        this.email_id=email_id;
        this.user_name=user_name;
        this.password=password;
    }
    switchcasereg(String password,long ph_no,String email_id,String user_name)
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
class mainregistration1
{
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number 1 for the u_name password and ph_no");
        System.out.println("enter the number 2 for the mail uname and pass");
        int n=sc.nextInt();
        switch(n)
        {
            case 1:
                switchcasereg r1=new switchcasereg("yaswanth","tala-2002",8074006222l);
                r1.display();
                break;
            case 2:
                switchcasereg r2=new switchcasereg("ytalanki@gitam.in","yaswanth","tala-2002");
                r2.display();
            case 3:

                switchcasereg r3=new switchcasereg("tala-2002",8074006222l,"ytalanki@gitam.in","yaswanth");
                r3.display();
            default :
                System.out.println("Enter the number below the 3");
        }
        // registration r1=new registration("yaswanth","tala-2002",8074006222l);
        // r1.display();
        // registration r2=new registration("ytalanki@gitam.in","yaswanth","tala-2002");
        // r2.display();
        // registration r3=new registration("tala-2002",8074006222l,"ytalanki@gitam.in","yaswanth");
        // r3.display();
    }
}