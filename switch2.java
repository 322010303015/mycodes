import java.util.Scanner;
class switch2
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        switch(str)
        {
            case "monday":
            case "wednesday":
                {
                    System.out.println("Baseket ball");
                    break;
                }
            case "tuesday":
            case "friday":
                {
                    System.out.println("tennis");
                    break;
                }
            case "thursday":
            {
                System.out.println("cricket");
                break;
            }
            case "saturday":
            {
                System.out.println("Exercise");
                break;
            }
            case "sunday":
            {
                System.out.println("hoiliday");
                break;
            }
            default :
            {
                System.out.println("Invalid");
                break;
            }
        }
    }
}