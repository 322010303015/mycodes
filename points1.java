import java.util.*;

class Point 
{
    int x, y;
    Point(int x, int y) 
    {
        this.x = x;
        this.y = y;
    }
}

public class points1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many points you want");
        int n = sc.nextInt();
        Point[] p = new Point[n];
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Enter x and y for point " + (i + 1) + ":");
            p[i] = new Point(sc.nextInt(), sc.nextInt());
        }
        System.out.println("You entered the following points:");
        for (int i = 0; i < p.length; i++) 
        {
            System.out.println("(" + p[i].x + ", " + p[i].y + ")");
        }
    }
}
