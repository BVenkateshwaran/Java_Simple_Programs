package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	static Scanner sc = new Scanner(System.in);
	public static boolean binary_search(int [] a, int key)
	{
		int l=0,h=a.length-1;
		while(l<=h)
		{
			int mid=(l+h)/2;
			if(key == mid)
				return true;
			else if(key<mid)
				h=mid;
			else if(key > mid)
				l=mid+1;
			
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,10,2,9,3,8,4,7,5,6};
		System.out.println("A : "+Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("A : "+Arrays.toString(a));
		System.out.println("Enter number to search : ");
		int key = sc.nextInt();
		boolean flag = binary_search(a,key);
		if(flag)
			System.out.println("Element is present!");
		else
			System.out.println("Element is not present!");
	}
}
