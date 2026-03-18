package Array;

public class LeetCode_BuildingSunLight {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {4,2,5,3,6,5,3};
		int max = Integer.MIN_VALUE,count = 0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i] > max)
			{
				max = a[i];
				count++;
			}
		}
		System.out.println("Number of Buildings that gets Sunlight : "+ count);
	}

}
