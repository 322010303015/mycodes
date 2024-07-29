import java.util.*;
class temptofar
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        //celsis to faherenhit
        //f=c*(9/5)+32
        System.out.println("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        double min_temp=70;
        double max_temp=80;
        double fahrenheit = (celsius * 9/5) + 32;
        System.out.println("Current Temperature in Fahrenheit: " + fahrenheit);
        if(fahrenheit>=min_temp && fahrenheit<=max_temp)
        {
            System.out.println("temp is normal");
        }
    }
}