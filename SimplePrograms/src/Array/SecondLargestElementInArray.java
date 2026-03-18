package Array;

public class SecondLargestElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,9,2,10,8,3,11,7,6,4,12,5,10};
		int max = Integer.MIN_VALUE;
		int second_max = Integer.MIN_VALUE;
		for(int i =0;i<a.length;i++)
		{
			if(a[i] > max)
			{
				second_max = max;
				max = a[i];
			}
			else if(a[i] > second_max && a[i] != max)
			{
				second_max = a[i];
			}
		}
		System.out.println("Largest Element in Array : "+max);
		System.out.println("Second Largest Element in Array : "+second_max);

	}

}
