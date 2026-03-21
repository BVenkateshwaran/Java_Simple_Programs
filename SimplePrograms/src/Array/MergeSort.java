package Array;
import java.util.*;
public class MergeSort
{
	static Scanner sc = new Scanner(System.in);
	
	public static void divide(int [] a,int l,int h)
	{
		if(l==h)
			return;
		int m = (l+h)/2;
		divide(a,l,m);
		divide(a,m+1,h);
		merge(a,l,m,h);
		//System.out.println("A : "+Arrays.toString(a));
	}
	
	public static void merge(int [] a,int l, int m, int h)
	{
		int left = l,right = m+1;
		int [] k = new int[a.length];
		int x = 0;
		while(left <= m && right <= h)
		{
			if(a[left] < a[right])
				k[x++] = a[left++];
			else if(a[left] > a[right])
				k[x++] = a[right++];
			else
				k[x++] = a[left++];
		}
		while(left <= m)
			k[x++] = a[left++];
		while(right <= h)
			k[x++] = a[right++];
		//System.out.println("K in loop : "+Arrays.toString(k));
		x=0;
		for(int i=l;i<=h;i++)
			a[i] = k[x++];
		//System.out.println("A in loop : "+Arrays.toString(a));
	}
	
	public static void main(String[] args) {
		int [] a = {1,9,2,8,3,10,7,4,6,5};
		System.out.println("A : "+Arrays.toString(a));
		int l=0,h=a.length-1;
		divide(a,l,h);
		System.out.println("A : "+Arrays.toString(a));
	}
}
