package Simple;

import java.util.Scanner;

public class CheckArmstrongNumber {
	
	static Scanner sc = new Scanner(System.in);
	
	public static int countDigits(int n)
	{
		String len = Integer.toString(n);
		int d = len.length();
		System.out.println("length of "+n+" = "+d);
		return d;
	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		System.out.println("Enter a number : ");
		int n = sc.nextInt();
		
		int len = countDigits(n);
		int l=0,sum=0,t=1,n1=n;
		
		while(n>0)
		{
			l = n%10;
			t=1;
			for(int i = 1;i <= len; i++)
			{
				t = t*l;
			}
			System.out.println("Cube of "+l+" = "+t);
			sum = sum+t;
			System.out.println("Sum = "+sum);
			n = n/10;
		}
		if(n1 == sum)
			System.out.println(n1+" is a Armstrong Number");
		else
			System.out.println(n1+" is not a Armstrong Number");

	}

}
