package Array;

import java.util.Scanner;

public class ReverseArray
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter size : ");
		int n = sc.nextInt();
		int [] a = new int [n];
		//System.out.println(a.length);
		for(int i=0;i<a.length;i++)
		{
			System.out.println("Enter element a["+i+"]:");
			a[i] = sc.nextInt();
		}
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}
}
