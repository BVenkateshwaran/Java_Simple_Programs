package Array;

import java.util.Arrays;

public class LeetCode_Trapping_Rain_Water {

	public static int water(int [] a)
	{
		int [] lm = new int [a.length];
		int [] rm = new int [a.length];
		lm[0] = a[0];
		for(int i=1;i<a.length;i++)
		{
			lm[i] = Math.max(lm[i-1], a[i]);
		}
		rm[a.length-1] = a[a.length-1];
		for(int i=a.length-2;i>=0;i--)
		{
			rm[i] = Math.max(rm[i+1], a[i]);
		}
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			int wl = Math.min(lm[i], rm[i]);
			sum = sum + wl - a[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(Arrays.toString(a));
		System.out.println("Number of water untis between buildings : "+water(a));

	}

}
