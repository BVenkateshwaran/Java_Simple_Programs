package Array;

import java.util.Arrays;

import java.util.Scanner;

public class RotateClockwise {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,5,2,4,3};
		System.out.println(a[a.length - 1]);
		System.out.println(Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Sorted Array : "+Arrays.toString(a));
		System.out.println("Enter the number of times to rotate the array : ");
		int k = sc.nextInt();
		for (int i = 0; i < k; i++)
		{
			int l = a[a.length - 1];
			for (int j = a.length-1; j>0; j--)
			{
				a[j] = a[j-1];
			}
			a[0] = l;
		}
		System.out.println(Arrays.toString(a));
	}
}
