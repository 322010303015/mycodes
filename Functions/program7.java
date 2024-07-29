class program7
{
    public static void main(String[] args)
    {
        double no_of_apples=3;
        double apple_cost_per_1000grams=325;
        double total_weight_of_apples=852;
        double a=apple_cost_per_1000grams/1000;
        System.out.println(a); //3.25
        double toal_cost=a*total_weight_of_apples;
        System.out.println("total cost "+toal_cost);
        double with_gst=toal_cost*.10;
        System.out.println("gst_bill "+with_gst);
        double res=toal_cost+with_gst;
        System.out.println("Total bill "+res);

    }
}