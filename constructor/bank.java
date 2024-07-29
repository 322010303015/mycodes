class bank
{
    double account_no;
    double balance;
    String name;
    bank(double arg1,double arg2,String arg3)
    {
        account_no=arg1;
        balance=arg2;
        name=arg3;
    }
    void view_balance()
    {
        System.out.println("you balance is "+balance);
    }
    void deposit(double n)
    {
        System.out.println("your deposit amount is "+n);
        balance+=n;
    }
    void withdraw(int n)
    {
        if(n<=balance)
        {
            balance-=n;
            System.out.println("Transaction sucessful ");
        }
        else
        {
            System.out.println(" Not having suffiecient balance in your account");
        }
    }
}
class mainbank
{
    public static void main(String[] args)
    {
        System.out.println("Main Method started");
        bank b1=new bank(3015,100000,"yaswanth");
        b1.view_balance();
        b1.deposit(5000);
        b1.view_balance();
        b1.withdraw(10000);
        b1.view_balance();
        System.out.println("Main Method ended");
    }
}