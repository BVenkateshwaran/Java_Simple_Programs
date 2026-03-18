package Array;

public class MissingElementsInArray {
	public static void missing(int [] a)
	{
		int k=1;
		for(int i = 0;i<a.length;i++)
		{
			if(a[i] != k)
			{
				System.out.println(k);
				i--;
			}
			k++;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = {1,3,6,7};
		missing(a);

	}

}
