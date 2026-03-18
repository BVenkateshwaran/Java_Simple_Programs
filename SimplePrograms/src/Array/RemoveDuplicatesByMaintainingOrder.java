package Array;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class RemoveDuplicatesByMaintainingOrder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {7,6,3,6,4,1,2,4};
		System.out.println(Arrays.toString(a));
		LinkedHashSet<Integer> new_a = new LinkedHashSet<Integer>();
		for(int i=0;i<a.length;i++)
		{
			new_a.add(a[i]);
		}
		System.out.println(new_a);

	}

}
