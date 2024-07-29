class program1
{
    public static void square()
    {
        int n=5;
        int res=n*n;
        System.out.println("square of "+n+" is "+res);
    }
    public static void cube()
    {
        int n=5;
        int res=n*n*n;
        System.out.println("cube of "+n+" is "+res);
    }
    public static void main(String[] args)
    {
        System.out.println("Main method Started");
        square();
        cube();
        System.out.println("Main methos ended");
    }
}