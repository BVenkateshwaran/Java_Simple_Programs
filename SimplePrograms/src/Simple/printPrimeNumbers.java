package Simple;

import java.util.Scanner;

public class printPrimeNumbers {
	
	static Scanner sc = new Scanner(System.in);
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
			return false;
		else
		{
			for(int j = 2;j<n;j++)
			{
				if(n%j == 0)
				{
					return false;
				}
			}
		}
		return true;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter starting number : ");
		int start = sc.nextInt();
		System.out.println("Enter ending number : ");
		int end = sc.nextInt();
		
		for(int i = start;i<=end;i++)
		{
			if(isPrime(i))
			{
				System.out.println(i + " ");
			}
		}

	}

}
