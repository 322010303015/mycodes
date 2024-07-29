import java.util.*;
class discount
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price");
        double price = sc.nextDouble();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        double price_after_discount=price;
        double discount = 0.0;
        System.out.println(price);
        if(age>=13 && age<=19)
        {
            price_after_discount=price-(price*0.05);
            if(price_after_discount>5000)
            {
                price_after_discount=price_after_discount-(price_after_discount*0.05);
            }
        }
        else if(age>=20 && age<=29)
        {
            price_after_discount=price-(price*0.06);
            if(price_after_discount>4000)
            {
                price_after_discount=price_after_discount-(price_after_discount*0.06);
            }
        }
        else if(age>29)
        {
            price_after_discount=price_after_discount-(price_after_discount*0.15);
        }
        System.out.println(price_after_discount);
        System.out.println(price-price_after_discount);

    }
}