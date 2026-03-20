package Array;

import java.util.Scanner;

public class LinearSearch {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int [] a = {1,9,2,8,3,7,4,6,5};
		int n = a.length;
		boolean flag=false;
		System.out.println("The length of the array : "+n);
		System.out.println("Enter the number to search : ");
		int key = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			if(a[i] == key)
			{
				flag = true;
			}
		}
		if(flag)
			System.out.println("The element is present!");
		else
			System.out.println("The element is not present!");
	}
}
