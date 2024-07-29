import java.util.*;
class mat
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        double n=sc.nextDouble();
        System.out.println("The absolute value of "+n+" is "+Math.abs(n));
        System.out.println("The ceil value of "+n+" is "+Math.ceil(n));
        System.out.println("The floor value of "+n+" is "+Math.floor(n));
        System.out.println("The power of the number "+Math.pow(2,3));
        System.out.println("The Round of the number "+n+" is "+Math.round(n));
        System.out.println("The exponenitial of the number "+n+" is "+Math.exp(n));
        System.out.println("The log of the number"+n+" is "+Math.log(n));
        System.out.println("The log of base 10 "+n+" is "+Math.log10(n));
        System.out.println("The min of 2 numbers is "+Math.min(2,4));
        System.out.println("The max of 2 numbers is"+Math.max(2,5));
        System.out.println("The random number is"+Math.random());


    }
}