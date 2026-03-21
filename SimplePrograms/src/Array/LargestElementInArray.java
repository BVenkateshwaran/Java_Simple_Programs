package Array;

public class LargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1,8,4,10,6,2,11,7,9,12,6,3,5};
		int max = Integer.MIN_VALUE;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
			}
		}
		System.out.println("The Largest Element in Array : "+max);
	}

}
