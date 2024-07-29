class program1
{
    public static void main(String[] args)
    {
        String name="Verna";
        double price=2100000;
        int cc=2000;
        double tax=0;
        double insurance=0;
        if(price<1000000)
        {
            tax=price*.18;
        }
        else if(price>=1000000 && price<2000000)
        {
            tax=price*.26;
        }
        else if(price>=2000000 && price<3000000)
        {
            tax=price*.32;
        }
        else
        {
            tax=price*.36;
        }
        if(cc<1000)
        {
            insurance=insurance+(2350*5);
        }
        else if(cc>=1000 && cc<2000)
        {
            insurance=insurance+(5750*5);
        }
        else if(cc>=2000 && cc<3000)
        {
            insurance=insurance+(6950*5);
        }
        else
        {
            insurance=insurance+(7450*5);
        }
        System.out.println("car name is"+name);
        System.out.println("price of the car is "+price);
        System.out.println("insurance is "+insurance);
        System.out.println("tax is "+tax);
        System.out.println("cc is "+cc);
        double onroad_price=price+tax+insurance;
        System.out.println("the total on  road price is"+onroad_price);
    }
}