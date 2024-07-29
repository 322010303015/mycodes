class ticketcounter
{
    int counternumber;
    int no_of_ticket;
    ticketcounter(int arg1,int arg2)
    {
        counternumber=arg1;
        no_of_ticket=arg2;
    }
    void view_ticket()
    {
        System.out.println("Total no. of tickets "+no_of_ticket);
    }
    void buy_tickets(int n)
    {
        System.out.println("buying "+n+" tickets");
        if(n<no_of_ticket)
        {
            no_of_ticket-=n;
            System.out.println("Buying successful");
        }
        else
        {
            System.out.println("Buying tickets failed due to in-suffiecient tickets");
        }
    }
    void cancel_tickets(int n)
    {
        System.out.println("cancel "+n+" tickets");
        no_of_ticket+=n;
    }
}
class mainticketcounter
{
    public static void main(String[] args)
    {
        System.out.println("Main Method Started");
        ticketcounter t1=new ticketcounter(100,50);
        t1.view_ticket();
        t1.buy_tickets(10);
        t1.view_ticket();
        t1.cancel_tickets(5);
        t1.view_ticket();
    }
}