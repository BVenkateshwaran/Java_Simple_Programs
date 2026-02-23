package Simple;

import java.util.Scanner;

public class IntegerBinaryToDecimal
{
	static Scanner sc = new Scanner(System.in);
	
	public static int convert(int n)
	{
		int d=0;
		int i=0,r=0;
		while(n!=0)
		{
			r = n%10;
			n = n/10;
			d += r * Math.pow(2, i);
			i++;
		}
		return d;
	}
	
	public static void main(String[] args)
	{
		System.out.println("Enter a binary number : ");
		int n = sc.nextInt();
		int d = convert(n);
		System.out.println("Binary "+n+" = "+d+" Decimal");
	}

}
