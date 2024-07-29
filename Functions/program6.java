class program6
{
    public static void main(String[] args)
    {
        double no_of_persons=6;
        double cost_of_dosa=135;
        double total_cost=no_of_persons*cost_of_dosa;
        System.out.println("Total bill is"+total_cost);
        double total_bill_with_gst=total_cost*.18;
        double totalbill=total_bill_with_gst+total_cost;
        System.out.println("Total bill with gst "+totalbill);
    }
}