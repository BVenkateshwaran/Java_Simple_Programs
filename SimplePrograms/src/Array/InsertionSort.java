package Array;
import java.util.*;
public class InsertionSort
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] a = {10,9,2,8,3,7,4,6,5};
		System.out.println("A : "+Arrays.toString(a));
		for(int i=1;i<a.length;i++)
		{
			int r = a[i];
			int l=i-1;
			while(l>=0 && a[l]>r)
			{
				a[l+1] = a[l];
				l--;
			}
			a[l+1] = r;
			System.out.println("A : "+Arrays.toString(a));
		}
		System.out.println("A : "+Arrays.toString(a));
	}
}
