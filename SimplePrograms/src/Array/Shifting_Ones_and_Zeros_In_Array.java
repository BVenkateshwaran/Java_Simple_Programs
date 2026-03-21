package Array;

import java.util.Arrays;

public class Shifting_Ones_and_Zeros_In_Array {
	public static void shift(int [] a)
	{
		int l=0,r = a.length-1;
		while(l<r)
		{
			if(a[l] == 0 && a[r] == 1)
			{
				int temp = a[l];
				a[l] = a[r];
				a[r] = temp;
				l++;
				r--;
			}
			if(a[l] == 1)
				l++;
			if(a[r] == 0)
				r--;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {0,1,0,1,1,0};
		System.out.println(Arrays.toString(a));
		shift(a);

	}

}
