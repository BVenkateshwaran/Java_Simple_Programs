package Array;

import java.util.Scanner;

public class SumOfPrimesInArray
{	
	static Scanner sc = new Scanner(System.in);
	public static boolean check(int n)
	{
		if(n<=1)
			return false;
		else
		{
			for(int i=2;i<n;i++)
			{
				if(n%i == 0)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{
		int [] a = {4,5,2,6,8,7,11};
		
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			if(check(a[i]))
			{
				System.out.println(sum+" + "+ a[i] +" = "+ (sum+a[i]));
				sum = sum+a[i];
			}
		}
		
		System.out.println(sum);
	}

}
