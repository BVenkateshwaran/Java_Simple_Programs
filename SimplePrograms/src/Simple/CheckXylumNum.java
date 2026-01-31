package Simple;

import java.util.Scanner;

// Check Number is Xylum or Phloem

public class CheckXylumNum {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		int s1 = 0,s2 = 0,n1 = n;
		s1 = n%10;
		n = n/10;
		while (n>9)
		{
			s2 = s2+n%10;
			n = n/10;
		}
		s1 = s1+n;
		if(s1 == s2)
		{
			System.out.println(n1+" is a Xylum Number");
		}
		else
		{
			System.out.println(n1+" is a Phloem Number");
		}
	}
}
