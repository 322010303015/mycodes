class swapwithouttemp
{
    public static void main(String[] args)
    {
        int a = 10, b = 20;
        a=a+b; //a=30
        b=a-b; //30-20=10;
        a=a-b; //30-10=20;
        System.out.println(a+"\t"+b);
    }
}