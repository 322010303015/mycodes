class program10
{
    public static void main(String[] args)
    {
        int sum=0;
        for(int i=10;i<=99;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("The sum of all 2 digit even number is "+sum);
    }
}