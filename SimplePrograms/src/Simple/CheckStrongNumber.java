package Simple;

import java.util.Scanner;
public class CheckStrongNumber {
	
	static Scanner sc = new Scanner(System.in);

	public static int findFactorial(int num)
	{
		int fact = 1;
		for(int i = num;i>0;i--)
		{
			fact = fact*i;
		}
		return fact;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a num : ");
		int n = sc.nextInt();
		int n1 = n;
		int n2 = 0;
		while(n>0)
		{
			int l = n%10;
			System.out.println("last digit is : "+l);
			n2 = n2+findFactorial(l);
			n = n/10;
			System.out.println("n = "+n);
			System.out.println("n2 = "+n2);
		}
		if(n1 == n2)
			System.out.println(n1+" is a Strong Number!");
		else
			System.out.println(n1+"is not a Strong Number");
	}

}
