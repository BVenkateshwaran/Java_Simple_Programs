package Array;

import java.util.Arrays;

import java.util.Scanner;

public class RotateAntiClockwise
{	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		int [] a = {1,2,3,4,5};
		
		Arrays.sort(a);
		
		System.out.println(Arrays.toString(a));
		System.out.println("Enter the number of times to rotate : ");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++)
		{
			int f = a[0];
			for (int j = 0; j < a.length - 1; j++)
			{
				a[j] = a[j+1];
			}
			a[a.length-1] = f;
		}
		System.out.println(Arrays.toString(a));
	}

}
