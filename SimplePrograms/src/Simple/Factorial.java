package Simple;

import java.util.Scanner;

public class Factorial {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args)
	{
		System.out.println("Enter num : ");
		int f = 1;
		int n = sc.nextInt();
		for(int i=n;i>0;i--)
		{
			f = f*i;
		}
		System.out.println("Factorial of " + n + " = "+f);
	}
}

/*
Output:
Enter num : 
5
Factorial of 5 = 120
*/