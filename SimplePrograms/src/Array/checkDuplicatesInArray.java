package Array;

import java.util.Arrays;

public class checkDuplicatesInArray {
	public static boolean check(int a [])
	{
		Arrays.sort(a);
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]==a[i+1])
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {2,4,6,2,1,7};
		System.out.println("Duplicates are present : "+check(a));
	}

}
