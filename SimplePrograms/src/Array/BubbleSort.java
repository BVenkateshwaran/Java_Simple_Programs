package Array;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [] a = {1,9,2,8,3,7,4,6,5};
		System.out.println("A : "+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j] > a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
		}
		System.out.println("A : "+Arrays.toString(a));
	}
}
