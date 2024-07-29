class creatacc
{
    String name;
    long ac_no;
    double balance;
    static String isfc;
    static String branch;
    creatacc(String name,long ac_no,double balance)
    {
        this.name=name;
        this.ac_no=ac_no;
        this.balance=balance;
        isfc="SBI313";
        branch="ATP";
    }
    void display()
    {
        System.out.println("name: "+name+" ac_no: "+ac_no+" balance: "+balance+" isfc code "+isfc+" branch "+branch);
    }
}
class maincreatacc
{
    public static void main(String args[])
    {
        creatacc c1=new creatacc("sai",123456789,10000);
        creatacc c2=new creatacc("ram",987654321,20000);
        c1.display();
        c2.display();
    }
}