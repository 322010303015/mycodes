import java.util.*;
public class arr1
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] n={1,2,3,4,19,0,199};
		for(int i=0;i<n.length;i++)
		{
		    System.out.println(n[i]);
		}
        System.out.println("array is converted to string");
		System.out.println(Arrays.toString(n));
        System.out.println("sorted array is");
		Arrays.sort(n);
        for(int i=0;i<n.length;i++)
		{
		    System.out.println(n[i]);
		}
		System.out.println("binary search");
        int index=Arrays.binarySearch(n,4);
        System.out.println(index);

        System.out.println("equalls: ");
        int[] m={0,1,2,3,4,19,199};
        boolean e=Arrays.equals(n,m);
        System.out.println(e);

        System.out.println("copy of the array");
        int[] k=Arrays.copyOf(n, 7);
        for(int i=0;i<k.length;i++)
        {
            System.out.println(k[i]);
        }
	}
}