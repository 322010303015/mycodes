class program3
{
    public static void findsquare(int n)
    {
        int res=n*n;
        System.out.println("Square of"+n+"is "+res);
    }
    public static void main(String[] args)
    {
        System.out.println("Main method start");
        findsquare(5);
        findsquare(6);
        System.out.println("Main method ended");
    }
}