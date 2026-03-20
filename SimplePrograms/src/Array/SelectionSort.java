package Array;
import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int [] a = {1,9,2,8,3,7,4,6,5};
		System.out.println("A : "+Arrays.toString(a));
		for(int i=0;i<a.length-1;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j] < a[min])
					min=j;
			}
			int temp = a[min];
			a[min]=a[i];
			a[i]=temp;
		}
		System.out.println("A : "+Arrays.toString(a));
	}
}
