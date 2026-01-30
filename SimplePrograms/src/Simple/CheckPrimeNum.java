package Simple;
// Check number is Prime or not
import java.util.Scanner;

public class CheckPrimeNum {
	static Scanner sc = new Scanner(System.in);
	
	public static boolean isPrime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=n/2;i++)
		{
			if(n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args)
	{	
		System.out.println("Enter the num : ");
		int n = sc.nextInt();
		if(isPrime(n))
		{
			System.out.println(n+" is a Prime Number!");
		}
		else
		{
			System.out.println(n+" is not a Prime Number");
		}
	}

}
/*
Output:
Enter the num : 
11
11 is a Prime Number!
*/