package Array;

import java.util.Scanner;

public class LeetCode_TwoSum {
	static Scanner sc = new Scanner(System.in);
	public static void twosum(int [] a, int target)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j] == target)
				{
					System.out.println(a[i]+" + "+a[j]+" = "+target);
				}
			}
		}
	}
	public static void main(String[] args)
	{
		int [] a = {5,7,4,2,8,3,6,5};
		System.out.println("Enter target : ");
		int target = sc.nextInt();
		twosum(a,target);
	}

}
