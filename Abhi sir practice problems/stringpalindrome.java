import java.util.*;
class stringpalindrome
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String s=sc.next();
        String temp=s;
        String rev="";
        int length=s.length();
        System.out.println("length of the string is "+length);
        for(int i=length-1;i>=0;i--)
        {
            rev=rev+temp.charAt(i);
        }
        System.out.println("the reverse string is "+rev);
        if(temp.equals(rev))
            System.out.println("it is a palindrome");
        else
            System.out.println("it is not a palindrome");
    }
}